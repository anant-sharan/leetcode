class Solution {
    public boolean isPossible(int[] target) {
        int l=target.length,i;
        long s=0;
        PriorityQueue<Integer> q= new PriorityQueue<Integer>((a,b)->(b-a));
        for(i=0;i<l;i++)
        {
            q.add(target[i]);
            s=s+target[i];
        }
        while(q.peek()>1)
        {
            int n=q.poll();
            s=s-n;
            if(s==0)
                return false;
            if(s==1)
                return true;
            if(s>=n)
                return false;
            int ins=n%(int)s;
            if(ins<1)
                return false;
            s=s+ins;
            q.add(ins);
        }
        return true;
    }
}