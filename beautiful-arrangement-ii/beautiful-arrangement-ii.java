class Solution {
    public int[] constructArray(int n, int k) {
        int i;
        int a[]=new int[n];
        for(i=0;i<n-k;i++)
        {
            a[i]=i+1;
        }
        int l=i,num=n;
        while(l<n)
        {
            a[l]=num--;
            l=l+2;
        }
        l=i+1;
        num=n-k+1;
        while(l<n)
        {
            a[l]=num++;
            l=l+2;
        }
        return a;
    }
}