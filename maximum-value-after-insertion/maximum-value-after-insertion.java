class Solution {
    public String maxValue(String n, int x) {
        int i,l=n.length(),c=0;
        String s="";
        if(n.charAt(0)=='-')
        {
            for(i=1;i<l;i++)
            {
                char ch=n.charAt(i);
                if(Character.getNumericValue(ch)>x)
                {
                    s=s+n.substring(0,i)+x+n.substring(i);
                    ++c;
                    break;
                }
            }
            if(c==0)
            {
                s=s+n+x;
            }
        }
        else
        {
            c=0;
            for(i=0;i<l;i++)
            {
                char ch=n.charAt(i);
                if(Character.getNumericValue(ch)<x)
                {
                    s=s+n.substring(0,i)+x+n.substring(i);
                    ++c;
                    break;
                }
            }
            if(c==0)
            {
                s=s+n+x;
            }
        }
        return s;
    }
}