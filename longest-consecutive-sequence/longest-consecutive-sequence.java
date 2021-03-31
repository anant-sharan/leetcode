
import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int i,l=nums.length,c=0,max=0;
        Hashtable<Integer,Integer> h=new Hashtable<Integer,Integer>();
        for(i=0;i<l;i++)
        {
            h.put(nums[i],0);
        }
        for(i=0;i<l;i++)
        {
            c=0;
            if((int)h.get(nums[i])==0)
            {
                h.put(nums[i],1);
                ++c;
                while(h.containsKey(--nums[i]))
                {
                    
                    ++c;
                    h.put(nums[i],1);
                }
                while(h.containsKey(++nums[i]))
                {
                    if((int)h.get(nums[i])==1)
                    {
                        break;
                    }
                    ++c;
                    h.put(nums[i],1);
                }
                max=Math.max(max,c);
                
            }
        }
        return max;
    }
}