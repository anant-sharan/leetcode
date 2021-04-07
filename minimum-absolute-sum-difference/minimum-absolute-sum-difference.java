class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int l=nums1.length,i,max=0,maxp=0,minp=0,min=Integer.MAX_VALUE;
        long s=0;
        for(i=0;i<l;i++)
        {
            s=s+Math.abs(nums1[i]-nums2[i]);
            if(Math.abs(nums1[i]-nums2[i])>max)
            {
                max=Math.abs(nums1[i]-nums2[i]);
                maxp=i;
            }
        }
        for(i=0;i<l;i++)
        {
            if(Math.abs(nums1[i]-nums2[maxp])<min)
            {
                min=Math.abs(nums1[i]-nums2[maxp]);
                minp=i;
            }
        }
        s=s-max+min;
        s=s%((int)Math.pow(10,9)+7);
        int sum=(int)s;
        return sum;
    }
}