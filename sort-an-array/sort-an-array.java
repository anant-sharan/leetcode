class Solution {
    public int[] sortArray(int[] nums) {
        int l=nums.length;
        int n=quicksort(nums,0,l-1);
        return nums;
    }
    public int quicksort(int[] nums,int lo,int hi)
    {
        int i=lo,j=lo,p=hi;
        int l=nums.length;
        while(i<=hi)
        {
            if(nums[i]<=nums[p])
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                ++i;
                ++j;
            }
            else
            {
                ++i;
            }
        }
        if(lo<hi)
        {
            quicksort(nums,lo,j-2);
            quicksort(nums,j,hi);
        }
        return 0;
    }
}