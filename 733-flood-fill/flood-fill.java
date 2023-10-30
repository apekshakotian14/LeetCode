class Solution {
    int [][] dirs;
    int oldColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image == null || image.length == 0) return image;
        this.oldColor = image[sr][sc];
        int m = image.length;
        int n = image[0].length;
        if(image[sr][sc] == newColor) return image;
        this.dirs = new int[][]{{0,1},{0, -1},{1, 0},{-1, 0}};
        dfs(image, sr, sc, newColor, m, n);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int newColor, int m, int n){
        if(sr<0 || sc<0 || sr==m || sc== n || image[sr][sc] != oldColor) return;
        image[sr][sc] = newColor;
        for(int[] dir: dirs){
            int nr = sr + dir[0];
            int nc = sc + dir[1];
            dfs(image, nr, nc, newColor, m , n);
        }
    }
}