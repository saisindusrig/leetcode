class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int r = grid.length;
        int c = grid[0].length;
        boolean visited[][] = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    //method to find the islands
                    findIslands(grid,i,j,visited);
                    islands++;
                }

            }
        }
        return islands;
    }

    public void findIslands(char[][] grid, int r,int c,boolean[][] visited){
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        visited[r][c]=true;
        for(int i=0;i<4;i++){
            int x = dx[i]+r;
            int y = dy[i]+c;
            if(x>=0 && y>=0 && x<grid.length && y< grid[0].length && grid[x][y]=='1' && !visited[x][y]){
                findIslands(grid,x,y,visited);
            }

        }
    }
}