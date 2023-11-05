class Solution {
    List<List<String>> result;
    boolean [][] grid;
    public List<List<String>> solveNQueens(int n) {
        this.result = new ArrayList<>();
        this.grid = new boolean[n][n];
        helper(0, n);
        return result;
        }

    private void helper(int r, int n){
        if(r==n){
            List<String> li = new ArrayList<>();
            for(int i=0; i<n ; i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0; j<n ; j++){
                    if(grid[i][j]){
                        sb.append('Q');
                    }else{
                       sb.append('.'); 
                    }
                    
                }
                li.add(sb.toString());
            }
            result.add(li);
        }
        
        //
        for(int c=0; c<n; c++){
            if(isSafe(r, c)){
                grid[r][c] = true;
                helper(r+1, n);
                grid[r][c] = false;
            }
        }

    }

    private boolean isSafe(int r, int c){
        for(int i=0; i<r; i++){
            if(grid[i][c]){
                return false;
            }
        }
        int i = r;
        int j = c;
        while(i>=0 && j>=0){
            if(grid[i][j]){
                return false;
            } i--; j--;
        }
        i = r;
        j = c;
        while(i>=0 && j<grid.length){
            if(grid[i][j]){
                return false;
            } i--; j++;
        }
        return true;
    }

}