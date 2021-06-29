class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int i,l=nums.length,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,left=0,right=l-1,c=0;
        if(l==1)
            return 0;
        if(l==2)
        {
            if(nums[1]>=nums[0])
                return 0;
            else
                return 2;
        }
        for(i=0;i<l;i++)
        {
            if(isout(i,nums)==false)
            {
                ++c;
                max=Math.max(max,nums[i]);
                min=Math.min(min,nums[i]);
            }
        }
        if(c==0)
            return 0;
        while(left<l)
        {
            if(min<nums[left])
                break;
            ++left;
        }
        while(right>=0)
        {
            if(max>nums[right])
                break;
            --right;
        }
        //System.out.println(right);
        //System.out.println(left);
        return right-left+1;
    }
    public boolean isout(int i,int nums[])
    {
        if(i==0)
        {
            if(nums[i]<=nums[i+1])
                return true;
            else
                return false;
        }
        else if(i==nums.length-1)
        {
            if(nums[i]>=nums[i-1])
                return true;
            else 
                return false;
        }
        else
        {
            if(nums[i]>=nums[i-1] && nums[i]<=nums[i+1])
                return true;
            else
                return false;
        }
    }
}