class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i,l=gas.length,s=0,sum=0,p=0;
        for(i=0;i<l;i++)
        {
            sum=sum+gas[i]-cost[i];
            s=s+gas[i]-cost[i];
            if(s<0)
            {
                s=0;
                p=i+1;
            }
        }
        if(sum<0)
            return -1;
        else
        {
            if(p<l)
                return p;
            else
                return -1;
        }
    }
}