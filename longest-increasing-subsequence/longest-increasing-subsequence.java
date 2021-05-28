class Solution {
    public int lengthOfLIS(int[] nums) {
        int l=nums.length,i,max=0,c=0,j;
        if(l==1)
            return 1;
        int dp[]=new int[l];
        dp[0]=1;
        for(i=1;i<l;i++)
        {
            max=0;
            for(j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                {
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
            c=Math.max(c,dp[i]);
        }
        return c;
    }
}