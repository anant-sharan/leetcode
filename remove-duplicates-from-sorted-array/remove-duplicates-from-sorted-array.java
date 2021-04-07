class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1,l=nums.length,c=0;
        while(j<l)
        {
        	
            if(nums[i]==nums[j])
            {
            	++j;
            }
            else
            {
            	++i;
            	nums[i]=nums[j];
            	++j;
            }
            
                
            
            //++i;
            //++j;
        }
        return i+1;
    }
}