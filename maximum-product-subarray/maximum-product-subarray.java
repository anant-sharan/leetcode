class Solution {
    public int maxProduct(int[] nums) {
        int i,l=nums.length,max=nums[0],min=nums[0],currmax=nums[0];
        for(i=1;i<l;i++)
        {
            int t=max;
            max=Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            min=Math.min(nums[i],Math.min(nums[i]*min,nums[i]*t));
            currmax=Math.max(currmax,max);
        }
        return currmax;
    }
}