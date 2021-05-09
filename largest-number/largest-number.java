class Solution {
    class sort implements Comparator<String>
    {
        public int compare(String s1,String s2)
        {
            return (s2+s1).compareTo(s1+s2);
        }
    }
    public String largestNumber(int[] nums) {
        int l=nums.length,i;
        String s[]=new String[l];
        for(i=0;i<l;i++)
        {
            s[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(s,new sort());
        StringBuffer sb=new StringBuffer();
        for(i=0;i<l;i++)
        {
            sb.append(s[i]);
        }
        String str=String.valueOf(sb);
        if(str.charAt(0)=='0')
            return "0";
        else
            return str;
    }
}