class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        int i,j;
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(i=0;i<coins.length;i++)
        {
            for(j=coins[i];j<=amount;j++)
            {
                if(dp[j-coins[i]]!=Integer.MAX_VALUE)
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        if(dp[amount]!=Integer.MAX_VALUE)
            return dp[amount];
        else 
            return -1;
    }
}