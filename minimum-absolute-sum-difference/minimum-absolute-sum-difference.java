class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int l=nums1.length,i;
        int mod = (int)Math.pow(10,9) + 7;
        long tot=0,min=Long.MAX_VALUE;
        TreeSet<Integer> tree=new TreeSet<Integer>();
        for(i=0;i<l;i++)
        {
            tot=tot+Math.abs(nums1[i]-nums2[i]);
            tree.add(nums1[i]);
        }
        for(i=0;i<l;i++)
        {
            long a=Long.MAX_VALUE,b=Long.MAX_VALUE;
            long t=tot;
            t=t-(Math.abs(nums1[i]-nums2[i]));
            Integer ceil=tree.ceiling(nums2[i]);
            Integer floor=tree.floor(nums2[i]);
            if(ceil!= null)
                a=Math.min(Math.abs(ceil-nums2[i]),Math.abs(nums1[i]-nums2[i]));
            if(floor!=null)
                b=Math.min(Math.abs(floor-nums2[i]),Math.abs(nums1[i]-nums2[i]));
            t=t+(Math.min(a,b));
            min=Math.min(min,t);
        }
        return (int)(min%mod);
    }
}