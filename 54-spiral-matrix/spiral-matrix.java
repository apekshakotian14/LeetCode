class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0; int right = n-1;
        int top = 0; int bottom = m-1;
        List<Integer> list = new ArrayList<>();
        while(left <= right && top <= bottom){
            //top
            for(int j=left; j<=right; j++){
                list.add(matrix[top][j]);
            }
            top++;

            //bottom
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;
            
            //right
            if(top <= bottom){
                for(int j=right; j>=left; j--){
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }
            //left
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
            
        }
        return list;
    }
}