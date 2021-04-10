class Solution {
    public int smallestRangeI(int[] A, int k) {
        int l=A.length;
        if(l==1)
            return 0;
        Arrays.sort(A);
        int n=A[l-1]-A[0];
        if(n>k)
        {
            n=n-k;
            if(n>=k)
            {
                n=n-k;
                return n;
            }
            else
                return 0;
        }
        else
            return 0;
    }
}