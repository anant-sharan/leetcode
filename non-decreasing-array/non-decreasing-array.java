class Solution {
    public boolean checkPossibility(int[] nums) {
        int l=nums.length,i,c=0;
        if(l==1 || l==2)
            return true;
        else
        {
            if(nums[0]>nums[1])
            {
                ++c;
                nums[0]=nums[1];
            }
        }
        for(i=1;i<l-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                if(nums[i-1]>nums[i+1])
                {
                    nums[i+1]=nums[i];
                    ++c;
                }
                else
                {
                    nums[i]=nums[i+1];
                    ++c;
                }
            }
            if(c>1)
                return false;
        }
        return true;
    }
}