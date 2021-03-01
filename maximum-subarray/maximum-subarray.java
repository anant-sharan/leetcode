class Solution {
    public int maxSubArray(int[] nums) {
        int l=nums.length,i,s=0,max=nums[0];
        for(i=0;i<l;i++)
        {
            s=s+nums[i];
            max=Math.max(max,s);
            if(s<0)
                s=0;
        }
        return max;
    }
}