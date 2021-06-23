class Solution {
    public boolean isSumEqual(String f, String s, String t) {
        int i,l1=f.length(),l2=s.length(),l3=t.length(),n1=0,n2=0,n3=0;
        String s1="",s2="",s3="";
        for(i=0;i<l1;i++)
        {
            char ch=f.charAt(i);
            s1=s1+(ch-97);
        }
        for(i=0;i<l2;i++)
        {
            char ch=s.charAt(i);
            s2=s2+(ch-97);
        }
        for(i=0;i<l3;i++)
        {
            char ch=t.charAt(i);
            s3=s3+(ch-97);
        }
        n1=Integer.parseInt(s1);
        n2=Integer.parseInt(s2);
        n3=Integer.parseInt(s3);
        if((n1+n2)==n3)
            return true;
        else
            return false;
    }
}