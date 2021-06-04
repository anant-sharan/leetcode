class Solution {
    public int sumSubarrayMins(int[] arr) {
        int i,l=arr.length;
        long sum=0,mod=(int)(1e9+7);
        Stack<Integer> s=new Stack<Integer>();
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
            {
                s.push(i);
            }
            else
            {
                if(arr[i]<=arr[s.peek()])
                {
                    while(s.empty()==false && arr[s.peek()]>=arr[i])
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
            {
                s.push(i);
            }
            else
            {
                if(arr[i]<arr[s.peek()])
                {
                    while(s.empty()==false && arr[i]<arr[s.peek()])
                    {
                        right[s.pop()]=i;
                    }
                }
                s.push(i);
            }
        }
        for(i=0;i<l;i++)
        {
            sum=(sum+((long)(left[i]-i)*(i-right[i])*arr[i]))%mod;
        }
        return (int)sum;
    }
}