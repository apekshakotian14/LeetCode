class Solution {
    private int[][] dirs;
    int m; int n;
    public boolean exist(char[][] board, String word) {
        if(board == null) return false;
        dirs = new int[][]{{0, 1},{1, 0},{-1, 0}, {0, -1}};
        m = board.length;
        n = board[0].length;
        for(int i=0; i<m ; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == word.charAt(0)){
                    if(backtrack(board, i, j, word, 0)) return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, int i, int j, String word, int idx){
        if(idx == word.length()) return true;
        if(i < 0 || j< 0 || i==board.length || j ==board[0].length || board[i][j] == '#') return false;
        {
           
         if(board[i][j] == word.charAt(idx)){
                board[i][j] = '#';
                for(int [] dir: dirs){
                    int r = i + dir[0];
                    int c = j + dir[1];
                    if(backtrack(board,r,c, word, idx+1)) return true;
                }

                board[i][j] = word.charAt(idx);
            }
            return false;
        }
    }
}