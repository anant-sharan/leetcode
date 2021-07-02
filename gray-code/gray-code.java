class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> a=new ArrayList<Integer>();
        int i;
        n=(int)Math.pow(2,n)-1;
        for(i=0;i<=n;i++)
        {
            int num=i>>1;
            a.add(i^num);
        }
        return a;
    }
}