class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,l=nums.length,n=k,max=0;
        while(j<l)
        {
            if(n<0)
            {
                while(n<0)
                {
                    if(nums[i]==0)
                    {
                        ++n;
                    }
                    ++i;
                }
            }
            else
            {
                if(nums[j]==0)
                {
                    --n;
                }
                ++j;
            }
            if(n>=0)
                max=Math.max(max,(j-i));
        }
        return max;
    }
}