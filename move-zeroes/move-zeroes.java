class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int i=0,x=0;
        for(i=0;i<l;i++)
        {
            if(nums[i]!=0)
                nums[x++]=nums[i];
        }
        while(x<l)
            nums[x++]=0;
    }
}