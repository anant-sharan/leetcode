class Solution {
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length,c=grid[0].length,i,j,max=0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                count=0;
                if(grid[i][j]==1)
                {
                    dfs(grid,i,j,r,c);
                    max=Math.max(max,count);
                }
            }
        }
        return max;
    }
    public void dfs(int grid[][],int i,int j,int row,int col)
    {
        if(i>=0 && j>=0 && i<row && j<col && grid[i][j]==1)
        {
            grid[i][j]=0;
            ++count;
            dfs(grid,i+1,j,row,col);
            dfs(grid,i,j+1,row,col);
            dfs(grid,i-1,j,row,col);
            dfs(grid,i,j-1,row,col);
        }
    }
}