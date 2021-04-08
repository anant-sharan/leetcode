class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=nums.length,i=0,c=0,s=0;
        while(i<l)
        {
            if(nums[i]==1)
            {
                ++i;
                ++c;
            }
            else
            {
                ++i;
                c=0;
            }
            s=Math.max(s,c);
        }
        return s;
    }
}