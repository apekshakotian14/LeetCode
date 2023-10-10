class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        //no of rows
        int m = matrix.length;
        //no of columns
        int n = matrix[0].length;
        //one dimentional array
        int[] result = new int[m*n];
        int index = 0;
        int i = 0;
        int j = 0;
        boolean dir = true;
        while(index < m*n){
            //upward direction
            result[index] = matrix[i][j];
            index++;
            if(dir){
                if(i == 0 && j!=n-1){
                    j++; dir = false;
                }else if(j== n-1){
                    i++; dir = false;
                }else{
                    i--; j++;
                }
            //downward direction
            }else{
                if(j == 0 && i!=m-1){
                    i++; dir = true;
                }else if(i== m-1){
                    j++; dir = true;
                }else{
                    j--; i++;
                }
            }
        }
        return result;
            
        }
}