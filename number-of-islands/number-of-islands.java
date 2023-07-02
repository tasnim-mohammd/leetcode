class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) 
        return 0;
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    DepthFirstSearch(grid, i, j);
                }
            }
        }
        return count;       
    }
    private void DepthFirstSearch(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') return;
        grid[i][j] = '0';
        DepthFirstSearch(grid, i + 1, j);
        DepthFirstSearch(grid, i - 1, j);
        DepthFirstSearch(grid, i, j + 1);
        DepthFirstSearch(grid, i, j - 1);
    }
}