class Solution {
    public int projectionArea(int[][] grid) {
        int l1=grid.length,l2=grid[0].length;
        int s=0,i,j,max=0;
        for(i=0;i<l1;i++)
        {
            for(j=0;j<l2;j++)
            {
                if(grid[i][j]!=0)
                    ++s;
            }
        }
        for(i=0;i<l1;i++)
        {
            int n=l1-1;
        
                while(n>=0)
                {
                    max=Math.max(max,grid[i][n]);
                    --n;
                }
            
            s=s+max;
            max=0;
        }
        max=0;
        for(i=0;i<l2;i++)
        {
            int n=l2-1;
            
                while(n>=0)
                {
                    max=Math.max(max,grid[n][i]);
                    --n;
                }
            
            s=s+max;
            max=0;
        }
        return s;
    }
}