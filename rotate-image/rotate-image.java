class Solution {
    public void rotate(int[][] matrix) {
        int i,j,len=matrix.length,t=0,l=0,r=len-1;
        for(i=0;i<len;i++)
        {
            for(j=0;j<i;j++)
            {
                t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(i=0;i<len;i++)
        {
            l=0;
            r=len-1;
            while(l<=r)
            {
                t=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=t;
                ++l;
                --r;
            }
        }
    }
}