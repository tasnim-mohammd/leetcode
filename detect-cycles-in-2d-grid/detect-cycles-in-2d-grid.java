class Solution {
    public boolean containsCycle(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for( int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j< grid[0].length; j++)
            {
                if (!visited[i][j]) {
                if (dfs(grid,0, i, j,grid[i][j],  visited)) {
                return true;
                }
                }

            }
        }
        return false;
    }

   private boolean dfs(char[][] grid,int direction, int i, int j, char x,boolean[][] visited) {

       if(i < 0 || j <0 || j >= grid[0].length || i >= grid.length || grid[i][j] != x)
       {
           return false;
       }
       if(visited[i][j]) return true;

       visited[i][j] = true;
        return (direction != 3 && dfs(grid, 1, i + 1, j, x, visited)) 
            || (direction != 1 && dfs(grid, 3, i - 1, j, x, visited)) 
            || (direction != 2 && dfs(grid, 4, i, j + 1, x, visited)) 
            || (direction != 4 && dfs(grid, 2, i, j - 1, x, visited));  
    }
}