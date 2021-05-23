class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int l=nums.length,i;
        int a[]=new int[k];
        Stack<Integer> s=new Stack<Integer>();
        for(i=0;i<l;i++)
        {
            if(s.empty())
            {
                s.push(nums[i]);
            }
            else
            {
                if(s.peek()>nums[i])
                {
                    while(s.empty()==false && s.peek()>nums[i] && (l-i)+s.size()>k)
                    {
                        s.pop();
                    }
                    s.push(nums[i]);
                }
                else if(s.size()<k)
                {
                    s.push(nums[i]);
                }
            }
        }
        while(s.empty()==false)
        {
            a[--k]=s.pop();
        }
        return a;
    }
}