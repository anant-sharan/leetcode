class Solution {
    public String reverseStr(String s, int k) {
        char str[]=s.toCharArray();
        int i=0,j=k-1,l=str.length,left=0,right=0;
        while(j<l)
        {
            while(i<j)
            {
                char t=str[i];
                str[i]=str[j];
                str[j]=t;
                ++i;
                --j;
            }
            if(i==j)
            {
                i=i+(k/2)+k+1;
                j=j+(k/2)+(2*k);
            }
            if(j<i)
            {
                j=j+(k/2)+(2*k);
                i=i+(k/2)+k;
            }
        }
        if(i<l)
        {
            left=i;
            right=l-1;
            while(left<right)
            {
                char t=str[left];
                str[left]=str[right];
                str[right]=t;
                ++left;
                --right;
            }
        }
        return String.valueOf(str);
    }
}