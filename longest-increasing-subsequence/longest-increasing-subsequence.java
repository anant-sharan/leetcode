class Solution {
    public int lengthOfLIS(int[] nums) {
        int l=nums.length,i,j,max=0;
        int dp[]=new int[l];
        for(i=0;i<l;i++)
            dp[i]=1;
        max=dp[0];
        for(i=1;i<l;i++)
        {
            for(j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                {
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}