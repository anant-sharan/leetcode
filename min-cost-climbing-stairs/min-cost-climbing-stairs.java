class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int l=cost.length;
        int dp[]=new int[l];
        int i=0,s=0;
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(i=2;i<l;i++)
        {
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[l-1],dp[l-2]);
    }
}