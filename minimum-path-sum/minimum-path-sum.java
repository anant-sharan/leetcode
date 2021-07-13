class Solution {
    public int minPathSum(int[][] grid) {
        int i,j,r=grid.length,c=grid[0].length;
        int dp[][]=new int[r][c];
        for(i=r-1;i>=0;i--)
        {
            for(j=c-1;j>=0;j--)
            {
                if(i==r-1 && j==c-1)
                    dp[i][j]=grid[i][j];
                else if(i==r-1)
                    dp[i][j]=dp[i][j+1]+grid[i][j];
                else if(j==c-1)
                    dp[i][j]=dp[i+1][j]+grid[i][j];
                else
                    dp[i][j]=Math.min(dp[i][j+1],dp[i+1][j])+grid[i][j];
            }
        }
        return dp[0][0];
    }
}