class Solution {
    public int findDuplicate(int[] nums) {
        int l=nums.length,i;
        int a[]=new int[l];
        for(i=0;i<l;i++)
        {
            ++a[nums[i]];
            if(a[nums[i]]>1)
                return nums[i];
        }
        return 0;
    }
}