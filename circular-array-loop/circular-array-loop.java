import java.util.*;
class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int i,l=nums.length,j,c=0,current=1;
        int visited[]=new int[l];
        for(i=0;i<l;i++)
        {
            Hashtable<Integer,Integer> h=new Hashtable<Integer,Integer>();
            c=0;
            j=i;
            int sign=nums[i];
            while(c<=l)
            {
                h.put(j,0);
                if(sign*nums[j]<0 || visited[j]==1)
                    break;
                j=nextidx(j,nums);
                if(i==j && h.size()>1)
                    return true;
                ++c;
            }
            visited[i]=1;
        }
        return false;
    }
    public int nextidx(int j,int nums[])
    {
        int l=nums.length;
        j=j+nums[j];
        j=j%l;
        if(j<0)
            return j+l;
        else
            return j;
    }
}