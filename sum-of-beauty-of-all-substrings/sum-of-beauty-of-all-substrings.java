class Solution {
    public int beautySum(String s) {
        int i,k,j,l=s.length(),sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(i=0;i<l-1;i++)
        {
            int a[]=new int[26];
            for(j=i;j<l;j++)
            {
                max=Integer.MIN_VALUE;
                min=Integer.MAX_VALUE;
                char ch=s.charAt(j);
                a[ch-'a']=a[ch-'a']+1;
                for(k=0;k<26;k++)
                {
                    max=Math.max(max,a[k]);
                    if(a[k]!=0)
                        min=Math.min(min,a[k]);
                }
                if(max!=0 && min!=0)
                    sum=sum+(max-min);
            }
        }
        return sum;
    }
}