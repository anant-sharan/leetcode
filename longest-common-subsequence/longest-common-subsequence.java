class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int i,j,l1=text1.length(),l2=text2.length(),len1=0,len2=0;
        String dp[][]=new String[l1+1][l2+1];
        for(i=0;i<=l1;i++)
        {
            for(j=0;j<=l2;j++)
            {
                dp[i][j]="";
            }
        }
        //return dp[0][0].length();
        for(i=1;i<=l1;i++)
        {
            for(j=1;j<=l2;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+text1.charAt(i-1);
                }
                else
                {
                    if(dp[i-1][j]!=null)
                        len1=dp[i-1][j].length();
                    else
                        len1=0;
                    if(dp[i][j-1]!=null)
                        len2=dp[i][j-1].length();
                    else
                        len2=0;
                    if(len1>len2)
                        dp[i][j]=dp[i-1][j];
                    else
                        dp[i][j]=dp[i][j-1];
                }
            }
        }
        return dp[l1][l2].length();
    }
}