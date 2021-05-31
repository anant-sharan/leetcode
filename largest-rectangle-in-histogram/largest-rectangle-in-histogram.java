class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer> s=new Stack<Integer>();
        int i,l=h.length,p=0,area=0,max=0;
        int left[]=new int[l];
        int right[]=new int[l];
        for(i=0;i<l;i++)
        {
            left[i]=l;
            right[i]=-1;
        }
        for(i=0;i<l;i++)
        {
            if(s.empty()==true)
                s.push(i);
            else
            {
                if(h[i]<h[s.peek()])
                {
                    while(s.empty()==false && h[i]<h[s.peek()])
                    {
                        left[s.pop()]=i;
                    }
                }
                s.push(i);
            }
        }
        s.clear();
        for(i=l-1;i>=0;i--)
        {
            if(s.empty()==true)
                s.push(i);
            else
            {
                if(h[i]<h[s.peek()])
                {
                    while(s.empty()==false && h[i]<h[s.peek()])
                    {
                        right[s.pop()]=i;
                    }
                }
                s.push(i);
            }
        }
        for(i=0;i<l;i++)
        {
            area=(h[i]*(left[i]-right[i]-1));
            max=Math.max(max,area);
        }
        return max;
    }
}