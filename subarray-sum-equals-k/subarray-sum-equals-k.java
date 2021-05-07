import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int l=nums.length,i,c=0,sum=0;
        if(l==1)
        {
            if(nums[0]!=k)
                return 0;
            else
                return 1;
        }
        Hashtable<Integer,Integer> h= new Hashtable<Integer,Integer>();
        h.put(0,1);
        for(i=0;i<l;i++)
        {
            sum=sum+nums[i];
            if(h.containsKey(sum-k))
            {
                c=c+h.get(sum-k);
            }
            if(h.containsKey(sum))
                h.put(sum,h.get(sum)+1);
            else
                h.put(sum,1);
        }
        return c;
    }
}