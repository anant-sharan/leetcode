class Solution {
    public int majorityElement(int[] nums) {
        int i,r=0,c=0;
        for(i=0;i<nums.length;i++)
        {
            if(c==0)
            {
                r=nums[i];
                ++c;
            }
            else if(nums[i]==r)
            {
                ++c;
            }
            else
            {
                --c;
            }
        }
        return r;
    }
}