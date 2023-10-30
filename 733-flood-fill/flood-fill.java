class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image == null || image.length == 0) return image;
        int oldColor = image[sr][sc];
        int m = image.length;
        int n = image[0].length;
        if(image[sr][sc] == newColor) return image;
        Queue<Integer> q = new LinkedList<>();
        q.add(sr); //row index
        q.add(sc); //col index
        int [][] dirs = {{0,1},{0, -1},{1, 0},{-1, 0}};
        image[sr][sc] = newColor;
        while(!q.isEmpty()){
            int cr = q.poll();
            int cc = q.poll();
            for(int [] dir: dirs){
                int nr = cr + dir[0];
                int nc = cc + dir[1];
                if(nr >= 0 && nr < m && nc < n && nc >= 0 && image[nr][nc] == oldColor){
                    q.add(nr);
                    q.add(nc);
                    image[nr][nc] = newColor;
                }
            }

        }
        return image;

    }
}