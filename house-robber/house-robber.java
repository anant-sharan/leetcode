class Solution {
    public int rob(int[] nums) {
        int l,i;
        l=nums.length;
        if(l==0)
            return 0;
        if(l==1)
            return nums[0];
        int dp[]=new int[l];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(i=2;i<l;i++)
        {
            dp[i]=Math.max((dp[i-2]+nums[i]),dp[i-1]);
        }
        return dp[l-1];
    }
}