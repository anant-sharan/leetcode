class Solution {
    public int numIslands(char[][] grid) {
        int i,j,c=0;
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    ++c;
                    helper(grid,i,j);
                }
            }
        }
        return c;
    }
    public void helper(char grid[][],int i,int j)
    {
        if(i<grid.length && j<grid[0].length && i>=0 && j>=0 && grid[i][j]=='1')
        {
            grid[i][j]=0;
            helper(grid,i+1,j);
            helper(grid,i,j+1);
            helper(grid,i-1,j);
            helper(grid,i,j-1);
        }
    }
}