class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int i,j,r=dungeon.length,c=dungeon[0].length;
        int dp[][]=new int[r][c];
        for(i=r-1;i>=0;i--)
        {
            for(j=c-1;j>=0;j--)
            {
                if(i==r-1 && j==c-1)
                    dp[i][j]=Math.min(0,dungeon[i][j]);
                else if(i==r-1)
                    dp[i][j]=Math.min(0,dungeon[i][j]+dp[i][j+1]);
                else if(j==c-1)
                    dp[i][j]=Math.min(0,dungeon[i][j]+dp[i+1][j]);
                else
                    dp[i][j]=Math.min(0,dungeon[i][j]+Math.max(dp[i+1][j],dp[i][j+1]));
            }
        }
        return Math.abs(dp[0][0])+1;
    }
}