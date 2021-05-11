class Solution {
    public int superpalindromesInRange(String left, String right) {
        long l=Long.parseLong(left);
        long r=Long.parseLong(right);
        int magic=100000;
        int i,j,c=0;
        long num;
        for(i=1;i<magic;i++)
        {
            StringBuffer sb=new StringBuffer();
            sb.append(i);
            for(j=sb.length()-2;j>=0;j--)
            {
                sb.append(sb.charAt(j));
            }
            num=Long.parseLong(sb.toString());
            num=num*num;
            if(num>r)
                break;
            if(num>=l)
            {
                if(ispallindrome(num))
                    ++c;
            }
        }
        for(i=1;i<magic;i++)
        {
            StringBuffer sb=new StringBuffer();
            sb.append(i);
            for(j=sb.length()-1;j>=0;j--)
            {
                sb.append(sb.charAt(j));
            }
            num=Long.parseLong(String.valueOf(sb));
            num=num*num;
            if(num>r)
                break;
            if(num>=l)
            {
                if(ispallindrome(num))
                    ++c;
            }
        }
        return c;
    }
    public boolean ispallindrome(long num)
    {
        long n=num,r,rev=0;
        while(num!=0)
        {
            r=num%10;
            rev=(rev*10)+r;
            num=num/10;
        }
        if(rev==n)
            return true;
        else
            return false;
    }
}