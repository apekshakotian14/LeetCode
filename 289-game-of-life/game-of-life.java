class Solution {
    int[][] dirs;
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        //left i, j i, j-1, right i, j+1 up i-1, j down i+1, j, 
        this.dirs =new int[][]{{0,-1},{0, 1},{-1,0},{1, 0}, {-1,-1}, {-1, 1}, {1,1}, {1, -1}};
        // 1 --- 0 2
        // 0 --- 1 3
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                //count number of alives
                int count = countAlive(board, i, j, m, n);
                // 1 & overpopulation and under population
                if(board[i][j] == 1 && (count < 2|| count > 3)){
                    board[i][j] = 2;
                }
                if(board[i][j] == 0 && count == 3){
                    board[i][j] = 3;
                }
            }
        }
        //mutated value changing back to original
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 2){
                    board[i][j] = 0;
                }
                if(board[i][j] == 3){
                    board[i][j] = 1;
                }
            }
        }
    }

        private int countAlive(int[][] board, int i, int j, int m, int n){
            int count = 0;
            for(int[] dir: dirs){
                int nr = i + dir[0];
                int nc = j + dir[1];
                //if in bound and either 1 or 2 to check number of alives
                if(nr >= 0 && nr < m && nc >= 0 && nc < n && (board[nr][nc] == 1 || board[nr][nc] == 2)){
                    count++;
                }
            }
            return count;
        }

    }
