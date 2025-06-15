class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid== null || grid.length==0) return -1;
        int fresh=0;
        Queue<int[]> q = new LinkedList<>();
        int r = grid.length,c = grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        int min =0, queue_size=0;
        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};
        while(!q.isEmpty()){ //until queue is empty
            int s = q.size();
            for(int i=0;i<s;i++){ 
                int[] curr_queue = q.poll();
                for(int j=0;j<4;j++){
                    int x= curr_queue[0]+dx[j];
                    int y = curr_queue[1]+dy[j];
                    if(x<0 || y<0 || x>=r || y>=c ||grid[x][y]!=1){
                        continue;
                    }
                    grid[x][y]=2;
                    q.offer(new int[] {x,y});
                    fresh--;
                }
            }
            if(q.size()!=0){ //not rotten present
               min++;
            }
        }
        return fresh==0? min:-1;
    }
}