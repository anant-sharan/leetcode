import java.util.*;
class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int i,j,sum=0,max=0,l=wall.size(),s=0;
        Hashtable<Integer,Integer> h=new Hashtable<Integer,Integer>();
        for(i=0;i<wall.get(0).size();i++)
        {
            s=s+wall.get(0).get(i);
        }
        for(i=0;i<wall.size();i++)
        {
            sum=0;
            for(j=0;j<wall.get(i).size();j++)
            {
                sum=sum+wall.get(i).get(j);
                if(h.containsKey(sum))
                    h.put(sum,h.get(sum)+1);
                else
                    h.put(sum,1);
            }
        }
        Set<Integer> keys=h.keySet();
        h.remove(s);
        for(Integer key:keys)
        {
            max=Math.max(max,h.get(key));
        }
        //System.out.println(h);
        return l-max;
    }
}