class Solution {
    public int orangesRotting(int[][] grid) {
        //queue-- 
        if(grid.length==0) return -1;
        int m = grid.length; //rows 
        int n = grid[0].length; //columns
        int fresh =0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[] {i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int min=0;
        //bfs
        if(fresh==0) return 0;
        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] arr = q.poll();
                for(int j=0;j<4;j++){
                    int x = arr[0]+dx[j];
                    int y = arr[1]+dy[j];
                    if(x<0 || y<0 || x>=m || y>=n || grid[x][y]!=1) continue;
                    grid[x][y]=2;
                    q.offer(new int[] {x,y});
                    fresh--;
                }
            }
            if(q.size()!=0){
                min++;
            }
        }
        return fresh==0?min:-1;
    }
}