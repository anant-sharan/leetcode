class Solution {
    public int jump(int[] nums) {
        int l=nums.length,i=0,p=Integer.MAX_VALUE,min=0,j=0,c=0;
        if(l==1)
            return 0;
        int dp[]=new int[l];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[l-1]=0;
        for(i=l-2;i>=0;i--)
        {
            min=Math.min(i+nums[i],l-1);
            p=Integer.MAX_VALUE;
            for(j=i+1;j<=min;j++)
            {
                p=Math.min(p,dp[j]);
            }
            if(p!=Integer.MAX_VALUE)
                dp[i]=1+p;
        }
        return dp[0];
    }
}