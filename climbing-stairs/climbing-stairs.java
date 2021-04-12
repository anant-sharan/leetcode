class Solution {
    public int climbStairs(int n) {
        int i=1;
        int dp[]=new int[n];
        if(n==1)
            return 1;
        dp[0]=1;
        dp[1]=2;
        for(i=2;i<n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}