import java.util.*;
class Solution {
    public int[] avoidFlood(int[] rains) {
        Hashtable<Integer,Integer> h=new Hashtable<Integer,Integer>();
        TreeSet<Integer> t=new TreeSet<Integer>();
        int i,l=rains.length;
        int ans[]=new int[l];
        Integer num=0;
        for(i=0;i<l;i++)
        {
            if(rains[i]==0)
            {
                t.add(i);
                ans[i]=1;
            }
            else
            {
                if(h.containsKey(rains[i]))
                {
                    num=t.ceiling(h.get(rains[i]));
                    if(num==null)
                        return new int[0];
                    ans[num]=rains[i];
                    t.remove(num);
                }
                h.put(rains[i],i);
                ans[i]=-1;
            }
        }
        return ans;
    }
}