class Solution {
    public boolean checkOnesSegment(String s) {
        int l=s.length(),c=0,i,p=s.indexOf("0");
        if(p==-1)
            return true;
        for(i=p;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            {
                ++c;
                break;
            }
        }
        if(c>0)
            return false;
        else
            return true;
    }
}