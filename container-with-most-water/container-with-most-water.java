class Solution {
    public int maxArea(int[] height) {
        int i=0,l=height.length,j=l-1,max=0;
        while(i<j)
        {
            int min=Math.min(height[i],height[j]);
            int a=min*(j-i);
            max=Math.max(max,a);
            if(height[i]<height[j])
                ++i;
            else if(height[i]>height[j])
                --j;
            else
            {
                ++i;
                --j;
            }
        }
        return max;
    }
}