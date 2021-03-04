class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a= new ArrayList<List<Integer>>();
        int i,j,n=0;
        for(i=0;i<numRows;i++)
        {
            ArrayList<Integer> arr=new ArrayList<Integer>();
            for(j=0;j<=i;j++)
            {
                if(j==0)
                {
                    arr.add(1);
                }
                else if(j==i)
                    arr.add(1);
                else
                {
                    n=(int)a.get(i-1).get(j)+(int)a.get(i-1).get(j-1);
                    arr.add(n);
                }
            }
            a.add(arr);
        }
        return a;
    }
}