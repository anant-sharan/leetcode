import java.util.*;
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Hashtable<Integer,Integer> h=new Hashtable<Integer,Integer>();
        int i,l=time.length,c=0;
        for(i=0;i<l;i++)
        {
            int n=time[i]%60;
            if(n==0)
            {
                if(h.containsKey(0))
                    c=c+h.get(0);
                if(h.containsKey(n))
                    h.put(n,h.get(n)+1);
                else
                    h.put(n,1);
            }
            else{
            if(h.containsKey(60-n))
            {
                c=c+h.get(60-n);
            }
            //else
            //{
                if(h.containsKey(n))
                    h.put(n,h.get(n)+1);
                else
                    h.put(n,1);
            //}
        }}
        return c;
    }
}