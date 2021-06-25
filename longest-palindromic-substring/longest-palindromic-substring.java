class Solution {
    public String longestPalindrome(String s) {
        int i,len=s.length(),left=0,right=0,l,r;
        for(i=1;i<len;i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                l=i-1;
                r=i;
                while(s.charAt(r)==s.charAt(l))
                {
                    if(r-l>right-left)
                    {
                        right=r;
                        left=l;
                    }
                    if(l>0 && r<len-1)
                    {
                        --l;
                        ++r;
                    }
                    else
                        break;
                }
            }
            if(i!=len-1){
            if(s.charAt(i+1)==s.charAt(i-1))
            {
                l=i-1;
                r=i+1;
                while(s.charAt(r)==s.charAt(l))
                {
                    if(r-l>right-left)
                    {
                        right=r;
                        left=l;
                    }
                    if(l>0 && r<len-1)
                    {
                        --l;
                        ++r;
                    }
                    else
                        break;
                }
            }
            }
        }
        return s.substring(left,right+1);
    }
}