class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        Set<List<Integer>> h = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        int i,l=nums.length,right,left;
        for(i=0;i<l-2;i++)
        {
            left=i+1;
            right=l-1;
            while(left<right)
            {
                if(nums[left]+nums[right]==(-1*nums[i]))
                {
                    List<Integer> arr=new ArrayList<Integer>();
                    arr.add(nums[left]);
                    arr.add(nums[right]);
                    arr.add(nums[i]);
                    h.add(arr);
                    ++left;
                    --right;
                }
                else if(nums[left]+nums[right]<(-1*nums[i]))
                {
                    ++left;
                }
                else
                {
                    --right;
                }
            }
        }
        for (List value : h)
            a.add(value);
        return a;
    }
}