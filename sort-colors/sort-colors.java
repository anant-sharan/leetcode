class Solution {
    public void sortColors(int[] nums) {
        int z=0,t=0,o=0,i,l=nums.length;
        for(i=0;i<l;i++)
        {
            if(nums[i]==0)
                ++z;
            else if(nums[i]==1)
                ++o;
            else
                ++t;
        }
        for(i=0;i<l;i++)
        {
            if(z>0)
            {
                nums[i]=0;
                --z;
            }
            else if(o>0)
            {
                nums[i]=1;
                --o;
            }
            else
                nums[i]=2;
        }
        for(i=0;i<l;i++)
        {
            System.out.print(nums[i]);
        }
    }
}