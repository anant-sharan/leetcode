class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int i,j,m=mat.length,n=mat[0].length,row_st=0,row_end=0,col_st=0,col_end=0,s=0,c=0;
        int dp[][]=new int[m][n];
        dp[0][0]=mat[0][0];
        for(i=1;i<m;i++)
        {
            dp[i][0]=mat[i][0]+dp[i-1][0];
        }
        for(i=1;i<n;i++)
        {
            dp[0][i]=mat[0][i]+dp[0][i-1];
        }
        for(i=1;i<m;i++)
        {
            for(j=1;j<n;j++)
            {
                dp[i][j]=mat[i][j]+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                c=0;
                s=0;
                row_st=(i-k)-1;
                row_end=Math.min(m-1,i+k);
                col_st=(j-k)-1;
                col_end=Math.min(n-1,j+k);
                s=s+dp[row_end][col_end];
                if(col_st>=0)
                {
                    s=s-dp[row_end][col_st];
                    ++c;
                }
                if(row_st>=0)
                {
                    s=s-dp[row_st][col_end];
                    ++c;
                }
                if(c==2)
                {
                    s=s+dp[row_st][col_st];
                }
                mat[i][j]=s;
            }
        }
        return mat;
    }
}