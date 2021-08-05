import java.util.*;
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int i,j,l=nums1.length,c=0;
        Hashtable<Integer,Integer> h=new Hashtable<Integer,Integer>();
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                int s=nums1[i]+nums2[j];
                if(h.containsKey(s))
                    h.put(s,h.get(s)+1);
                else
                    h.put(s,1);
            }
        }
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                int s=nums3[i]+nums4[j];
                if(h.containsKey(0-s))
                    c=c+h.get(0-s);
            }
        }
        return c;
    }
}