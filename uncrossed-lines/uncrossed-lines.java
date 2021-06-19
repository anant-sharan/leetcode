class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int l1=nums1.length,l2=nums2.length,i,j;
        int dp[][]=new int[l1+1][l2+1];
        for(i=0;i<l1;i++)
        {
            for(j=0;j<l2;j++)
            {
                if(nums1[i]==nums2[j])
                    dp[i+1][j+1]=dp[i][j]+1;
                else
                    dp[i+1][j+1]=Math.max(dp[i][j+1],dp[i+1][j]);
            }
        }
        return dp[l1][l2];
    }
}