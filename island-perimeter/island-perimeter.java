class Solution {
    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                  return  DFS(grid, i, j);  
                }
            }
        }
        return 0;  
    }
    
    private int  DFS(int[][] grid, int i, int j) {
        if ((i < 0 || j < 0 || i >= grid.length || j >= grid[0].length ) )
            return 1;
        if (grid[i][j] == 0)
        return 1;
        if (grid[i][j] == -1) 
        return 0;
        
        int count = 0;
        grid[i][j] = -1;
  
        count += DFS(grid, i + 1, j);
        count += DFS(grid, i - 1, j);
        count += DFS(grid, i, j + 1);
        count += DFS(grid, i, j - 1);
        return count;
    }
}
