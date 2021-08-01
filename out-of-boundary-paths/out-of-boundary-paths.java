class Solution {
    int mod=1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        long dp[][][]=new long[m][n][maxMove+1];
        int i,j,k;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                for(k=0;k<=maxMove;k++)
                {
                    dp[i][j][k]=-1;
                }
            }
        }
        long c=out(m,n,maxMove,startRow,startColumn,dp);
        return (int)c%mod;
    }
    public long out(int m, int n, int max, int i, int j,long dp[][][])
    {
        if(i<0 || j<0 || i>=m || j>=n)
            return 1;
        if(max==0)
            return 0;
        if(dp[i][j][max]!=-1)
            return dp[i][j][max];
        dp[i][j][max]=(out(m,n,max-1,i-1,j,dp)+out(m,n,max-1,i+1,j,dp)+out(m,n,max-1,i,j-1,dp)+out(m,n,max-1,i,j+1,dp))%mod;
        return dp[i][j][max];
    }
}