class Solution {
    public int trap(int[] height) {
        int l=height.length;
        int dp[]=new int[l];
        int i,lmax=0,rmax=0,s=0;
        for(i=0;i<l;i++)
        {
            dp[i]=lmax;
            lmax=Math.max(lmax,height[i]);
        }
        for(i=l-1;i>=0;i--)
        {
            if(Math.min(dp[i],rmax)>height[i])
            {
                dp[i]=Math.min(dp[i],rmax)-height[i];
                s=s+dp[i];
            }
            rmax=Math.max(rmax,height[i]);
        }
        return s;
    }
}