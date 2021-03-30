class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int i,el1=0,el2=0,c1=0,c2=0,count1=0,count2=0,l=nums.length;
        List<Integer> a=new ArrayList<Integer>();
        for(i=0;i<l;i++)
        {
            if(el1==nums[i])
            {
                ++c1;
            }
            else if(el2==nums[i])
            {
                ++c2;
            }
            else if(c1==0)
            {
                el1=nums[i];
                ++c1;
            }
            else if(c2==0)
            {
                el2=nums[i];
                ++c2;
            }
            else
            {
                --c1;
                --c2;
            }
        }
        for(i=0;i<l;i++)
        {
            if(nums[i]==el1)
                ++count1;
            if(nums[i]==el2)
                ++count2;
        }
        if(el1==el2)
        {
            a.add(el1);
            return a;
        }
        else
        {
        if(count1>(l/3))
            a.add(el1);
        if(count2>(l/3))
            a.add(el2);
        return a;
        }
    }
}