class Solution {
    public int countBinarySubstrings(String s) {
        int i,l=s.length(),left=0,right=0,c=0;
        char ch1,ch2,ch3,ch4;
        for(i=0;i<l-1;i++)
        {
            ch1=s.charAt(i);
            ch2=s.charAt(i+1);
            if(ch1!=ch2)
            {
                ++c;
                left=i-1;
                right=i+2;
                while(left>=0 && right<l)
                {
                    ch3=s.charAt(left);
                    ch4=s.charAt(right);
                    if(ch3!=ch4 && ch3==ch1 && ch4==ch2)
                        ++c;
                    else
                        break;
                    --left;
                    ++right;
                }
            }
        }
        return c;
    }
}