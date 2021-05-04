class Solution {
    public int countHomogenous(String s) {
        long c=0,sum=0;
        char ch=s.charAt(0);
        int i,l=s.length();
		for(i=0;i<l;i++)
        {
            char ch1=s.charAt(i);
            if(ch1==ch)
                ++c;
            else
            {
                sum=sum+(c*(c+1))/2;
                sum=sum%((int)Math.pow(10,9)+7);
                c=1;
                ch=ch1;
            }
        }
        sum=sum+(c*(c+1))/2;
        sum=sum%((int)Math.pow(10,9)+7);
        return (int)sum;
    }
}