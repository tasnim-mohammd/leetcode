class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startPoint = image[sr][sc];
        if (startPoint == color)
            return image;

        DFS(image, sr, sc, color,  startPoint);

        return image;
    }

    private void DFS(int[][] image, int sr, int sc, int color, int startPoint) {
        if ( sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length|| image[sr][sc]!=  startPoint|| color == image[sr][sc])
            return;
        image[sr][sc] = color;
        DFS(image, sr + 1, sc, color,startPoint);
        DFS(image, sr - 1, sc, color,startPoint);
        DFS(image, sr, sc + 1, color,startPoint);
        DFS(image, sr, sc - 1, color,startPoint);
        return;
    }
}
