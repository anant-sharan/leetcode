class Solution {
    public String modifyString(String s) {
        if(s.length()==1)
        {
            if(s.charAt(0)=='?')
                return "a";
        }
        char c[]=s.toCharArray();
        char ch='a';
        int i,l=c.length;
        for(i=0;i<l;i++)
        {
            ch='a';
            if(c[i]=='?')
            {
                if(i==0)
                {
                    while(true)
                    {
                        if(ch!=c[i+1])
                        {
                            c[i]=ch;
                            break;
                        }
                        else
                        {
                            ++ch;
                        }
                    }
                }
                else if(i==(l-1))
                {
                    while(true)
                    {
                        if(ch!=c[i-1])
                        {
                            c[i]=ch;
                            break;
                        }
                        else
                        {
                            ++ch;
                        }
                    }
                }
                else
                {
                    while(true)
                    {
                        if(ch!=c[i+1] && ch!=c[i-1])
                        {
                            c[i]=ch;
                            break;
                        }
                        else
                            ++ch;
                    }
                }
            }
        }
        String str="";
        for(i=0;i<l;i++)
        {
            str=str+c[i];
        }
        return str;
    }
}