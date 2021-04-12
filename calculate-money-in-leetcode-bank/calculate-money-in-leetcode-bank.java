class Solution {
    public int totalMoney(int n) {
        int s=0,i,num=0,r=0;
        if(n<=7)
        {
            s=s+(n*(n+1))/2;
        }
        else
        {
            num=n/7;
            r=n%7;
            s=s+(28*num);
            s=s+(r*(r+1))/2;
            --num;
            for(i=1;i<=num;i++)
            {
                s=s+(i*7);
            }
            s=s+(i*r);
        }
        return s;
    }
}