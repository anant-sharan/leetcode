class Solution {
    public int candy(int[] ratings) {
        int i,l=ratings.length,s=0;
        int dp[]=new int[l];
        for(i=0;i<l;i++)
            dp[i]=1;
        for(i=1;i<l;i++)
        {
            if(ratings[i]>ratings[i-1])
                dp[i]=dp[i-1]+1;
        }
        s=dp[l-1];
        for(i=l-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
                dp[i]=Math.max(dp[i+1]+1,dp[i]);
            s=s+dp[i];
        }
        return s;
    }
}