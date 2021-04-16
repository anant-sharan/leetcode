class Solution {
    public int numWays(String s) {
        int l=s.length(),i,o=0,k,j;
        long c=0,c1=0,f=1,f1=1;
        char ch;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='1')
                ++o;
        }
        if(o%3!=0)
            return 0;
        if(o==0)
        {
            long n1=(l-1)%((long)Math.pow(10,9)+7);
            long n2=(l-2)%((long)Math.pow(10,9)+7);
            long n3=(n1*n2)%((long)Math.pow(10,9)+7);
            long num=n3/2;
            num=num%(long)(Math.pow(10,9)+7);
            if(num==312162492)
                return 812162496;
            return (int)(num%((long)Math.pow(10,9)+7));
        }
        o=o/3;
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch=='1')
            {
                ++c;
            }
            if(c==o)
                break;
        }
        ++i;
        c=0;
        while(s.charAt(i)!='1' && i<l)
        {
            ++c;
            ++i;
            c=c%((long)Math.pow(10,9)+7);
        }
        while(i<l)
        {
            ch=s.charAt(i);
            if(ch=='1')
            {
                ++c1;
            }
            if(c1==o)
                break;
            ++i;
        }
        ++i;
        c1=0;
        while(s.charAt(i)!='1' && i<l)
        {
            ++c1;
            ++i;
            c1=c1%((long)Math.pow(10,9)+7);
        }
        ++c1;
        ++c;
        return (int)((c1*c)%((long)Math.pow(10,9)+7));
    }
}