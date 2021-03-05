class Solution {
    public int maxProfit(int[] prices) {
        int l=prices.length,i,max=0,p=0;
        if(l==0)
            return 0;
        int dp[]=new int[l];
        dp[0]=prices[0];
        
        for(i=1;i<l;i++)
        {
            dp[i]=Math.min(dp[i-1],prices[i]);
        }
        for(i=0;i<l;i++)
        {
            p=prices[i]-dp[i];
            if(p>max)
                max=p;
        }
        return max;
    }
}