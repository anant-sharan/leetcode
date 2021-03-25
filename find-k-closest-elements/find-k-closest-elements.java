class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> a=new ArrayList<Integer>();
        int i,len=arr.length,pmin=-1,c=0,l,r,count=0;
        for(i=len-1;i>=0;i--)
        {
            arr[i]=arr[i]-x;
            if(arr[i]>=0)
            {
                pmin=i;
                
            }
        }
        if(arr[0]>=0)
        {
            for(i=0;i<k;i++)
            {
                a.add(arr[i]+x);
            }
        }
        else if(arr[len-1]<=0)
        {
            for(i=len-k;i<len;i++)
            {
                a.add(arr[i]+x);
            }
        }
        else
        {
            l=pmin-1;
            r=pmin;
            while(l>=0 && r<len)
            {
                if(Math.abs(arr[l])<=Math.abs(arr[r]))
                {
                    a.add(arr[l]+x);
                    --l;
                    ++c;
                }
                else
                {
                    a.add(arr[r]+x);
                    ++r;
                    ++c;
                }
                if(c==k)
                {
                    ++count;
                    break;
                }
            }
            if(count>0)
            {
                Collections.sort(a);
                return a;
            }
            else
            {
                if(l<0)
                {
                    while(c<=k)
                    {
                        
                        a.add(arr[r]+x);
                        ++r;
                        ++c;
                        if(c==k)
                        {
                            Collections.sort(a);
                            return a;
                        }
                    }
                }
                
                if(r>=len)
                {
                    while(c<=k)
                    {
                        
                        a.add(arr[l]+x);
                        --l;
                        ++c;
                        if(c==k)
                        {
                            Collections.sort(a);
                            return a;
                        }
                    }
                }
                Collections.sort(a);
                return a;
            }
        }
        return a;
    }
}