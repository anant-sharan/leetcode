import java.util.*;
class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int i,l=logs.length,n=0;
        Hashtable<Integer, HashSet> h=new Hashtable<Integer, HashSet>();
        int a[]=new int[k];
        for(i=0;i<l;i++)
        {
            if(h.containsKey(logs[i][0]))
            {
                HashSet sex=h.get(logs[i][0]);
                sex.add(logs[i][1]);
                h.put(logs[i][0],sex);
            }
            else
            {
                HashSet<Integer> s=new HashSet<Integer>();
                s.add(logs[i][1]);
                h.put(logs[i][0],s);
            }
        }
        Set<Integer> se=h.keySet();
        for(int j:se)
        {
            n=h.get(j).size();
            ++a[n-1];
        }
        
        return a;
    }
}