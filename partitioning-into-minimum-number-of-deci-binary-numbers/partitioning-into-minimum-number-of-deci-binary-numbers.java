class Solution {
    public int minPartitions(String n) {
        int i,l=n.length();
        int max=0;
        for(i=0;i<l;i++)
        {
            int ch=Integer.parseInt(String.valueOf(n.charAt(i)));
            max=Math.max(max,ch);
        }
        return max;
    }
}