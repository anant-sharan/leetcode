class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        int i,j;
        if(amount==0)
            return 0;
        //if(coins[0]>amount)
            //return -1;
        for(i=1;i<=amount;i++)
        {
            dp[i]=Integer.MAX_VALUE;
        }
        //Arrays.sort(coins);
        //if(coins[0]>amount)
            //return -1;
        for(i=0;i<coins.length;i++)
        {
            for(j=coins[i];j<=amount;j++)
            {
                
                    if(dp[j-coins[i]]!=Integer.MAX_VALUE)
                        dp[j]=Math.min(dp[j],1+dp[j-coins[i]]);
                    
                
            }
        }
        if(dp[amount]==Integer.MAX_VALUE)
            return -1;
        else
            return dp[amount];
    }
}