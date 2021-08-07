class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        k=k%l;
        int a[]=new int[l];
        int i,n=l-k,x=0;
        for(i=n;i<l;i++)
        {
            a[x++]=nums[i];
        }
        for(i=0;i<n;i++)
        {
            a[x++]=nums[i];
        }
        for(i=0;i<l;i++)
        {
            nums[i]=a[i];
        }
    }
}