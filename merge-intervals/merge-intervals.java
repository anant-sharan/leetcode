class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i,l=intervals.length,start=intervals[0][0],end=intervals[0][1],max=0;
        ArrayList<int[]> a=new ArrayList<int[]>();
        for(i=1;i<l;i++)
        {
            if(intervals[i][0]<=end)
            {
                end=Math.max(end,intervals[i][1]);
            }
            else
            {
                int arr[]={start,end};
                a.add(arr);
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        int arr[]={start,end};
        a.add(arr);
        int myarr[][]=new int[a.size()][2];
        return a.toArray(myarr);
    }
}