class Solution {
    public void nextPermutation(int[] nums) {
        int dec=0,l=nums.length,i=l-1,j=0,t=0,c=0;
        while(i>0)
        {
            if(nums[i]>nums[i-1])
            {
                dec=i-1;
                ++c;
                break;
            }
            --i;
        }
        if(c==0)
        {
            Arrays.sort(nums);
            
        }
        else
        {
        i=l-1;
        while(i>=0)
        {
            if(nums[i]>nums[dec])
            {
                t=nums[dec];
                nums[dec]=nums[i];
                nums[i]=t;
                break;
            }
            --i;
        }
        j=l-1;
        i=dec+1;
        while(i<j)
        {
            t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            ++i;
            --j;
        }
        }
    }
}