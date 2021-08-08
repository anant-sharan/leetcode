class Solution {
    public int longestPalindromeSubseq(String s) {
        int i,j,l=s.length();
        String rev="";
        for(i=l-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        int dp[][]=new int[l+1][l+1];
        for(i=1;i<=l;i++)
        {
            for(j=1;j<=l;j++)
            {
                if(s.charAt(i-1)==rev.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[l][l];
    }
}