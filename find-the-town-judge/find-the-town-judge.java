class Solution {
    public int findJudge(int n, int[][] t) {
        int i,l=t.length;
        int a[]=new int[n+1];
        int b[]=new int[n+1];
        for(i=0;i<l;i++)
        {
            ++b[t[i][0]];
            ++a[t[i][1]];
        }
        for(i=1;i<=n;i++)
        {
            if(a[i]==n-1 && b[i]==0)
                return i;
        }
        return -1;
    }
}