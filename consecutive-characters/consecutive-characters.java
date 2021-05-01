class Solution {
    public int maxPower(String s) {
        int l=s.length(),i,count=0,max=0;
        char c=s.charAt(0);
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==c)
            {
                ++count;
            }
            else
            {
                max=Math.max(max,count);
                c=ch;
                count=1;
            }
        }
        return Math.max(max,count);
    }
}