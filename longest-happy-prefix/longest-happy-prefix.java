class Solution {
    public String longestPrefix(String s) {
        int l=s.length(),i=0,j=1;
        int dp[]=new int[l];
        dp[0]=-1;
        while(j<l)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                dp[j]=i;
                ++i;
                ++j;
            }
            else if((s.charAt(i)!=s.charAt(j)) && i==0)
            {
                dp[j]=-1;
                ++j;
            }
            else
            {
                i=dp[i-1]+1;
            }
        }
        return s.substring(0,dp[l-1]+1);
    }
}