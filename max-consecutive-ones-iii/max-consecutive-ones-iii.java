class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,l=nums.length,max=0;
        while(j<l)
        {
            if(k<0)
            {
                while(k<0)
                {
                    if(nums[i]==0)
                        ++k;
                    ++i;
                }
            }
            else
            {
                if(nums[j]==0)
                    --k;
                ++j;
            }
            if(k>=0)
                max=Math.max(max,(j-i));
        }
        return max;
    }
}