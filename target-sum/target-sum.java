class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int l=nums.length,i,j,sum=0;
        for(i=0;i<l;i++)
            sum=sum+nums[i];
        if(sum<target)
            return 0;
        if((target+sum)%2!=0)
            return 0;
        int s=(target+sum)/2;
        int values[][]=new int[l+1][s+1];
        values[0][0]=1;
        for(i=1;i<=l;i++)
        {
            for(j=0;j<=s;j++)
            {
                if(nums[i-1]<=j)
                    values[i][j]=values[i-1][j]+values[i-1][j-nums[i-1]];
                else
                    values[i][j]=values[i-1][j];
            }
        }
        return values[l][s];
    }
}