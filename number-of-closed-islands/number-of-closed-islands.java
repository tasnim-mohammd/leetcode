class Solution {
    public int closedIsland(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    if (DFS(grid, i, j))
                        count++;
                }
            }
        }
        return count;
    }

    private boolean DFS(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return false;
        if (grid[i][j] == 1)
            return true;
        grid[i][j] = 1;
        boolean left = DFS(grid, i, j - 1);
        boolean right = DFS(grid, i, j + 1);
        boolean up = DFS(grid, i - 1, j);
        boolean down = DFS(grid, i + 1, j);
        return left && right && up && down;
    }
}
