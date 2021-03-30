import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,l=nums.length;
        Hashtable<Integer, Integer> h= new Hashtable<Integer, Integer>();
        int a[]=new int[2];
        for(i=0;i<l;i++)
        {
            if(h.containsKey(target-nums[i]))
            {
                a[0]=h.get(target-nums[i]);
                a[1]=i;
                break;
            }
            else
            {
                h.put(nums[i],i);
            }
        }
        return a;
    }
}

