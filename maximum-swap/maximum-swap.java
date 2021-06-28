class Solution {
    public int maximumSwap(int num) {
        String s=String.valueOf(num);
        char ch[]=s.toCharArray();
        int dig[]=new int[10];
        int i,j,l=ch.length;
        for(i=0;i<l;i++)
        {
            dig[ch[i]-'0']=i;
        }
        for(i=0;i<l;i++)
        {
            for(j=9;j>(ch[i]-'0');j--)
            {
                if(dig[j]>i)
                {
                    char t=ch[i];
                    ch[i]=ch[dig[j]];
                    ch[dig[j]]=t;
                    return Integer.parseInt(String.valueOf(ch));
                }
            }
        }
        return num;
    }
}