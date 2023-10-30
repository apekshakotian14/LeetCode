class Solution {
    int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
    int m;
    int n;
    public int orangesRotting(int[][] grid) {
        Queue<int []> q = new LinkedList<>();
        m = grid.length;
        n = grid[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 2){
                    dfs(grid, i, j, 2);
                }

            }
        }

        
        int time = 2;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1) return -1;
                else if(grid[i][j] > 2){
                    time = Math.max(time, grid[i][j]);
                }
            }
        }
        if(time == 2) return 0;
        return time - 2;
    }
    private void dfs(int [][] grid, int r, int c, int time){
        if(r < 0 || r == m || c< 0 || c==n ) return;
        if(grid[r][c] != 1 && grid[r][c] < time) return;
        grid[r][c] = time;
        for(int[] dir: dirs){
            int nr = r + dir[0];
            int nc = c + dir[1];
            dfs(grid, nr, nc, time+1);
        }
    }
}