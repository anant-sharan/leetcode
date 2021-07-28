class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int l=intervals.length,i;
        Arrays.sort(intervals,(a,b)->(a[0]!=b[0])?(a[0]-b[0]):a[1]-b[1]);
        PriorityQueue<Node> q=new PriorityQueue<Node>((a,b)->(b.end-a.end));
        q.add(new Node(intervals[0][0],intervals[0][1]));
        for(i=1;i<l;i++)
        {
            if(intervals[i][0]>=q.peek().end)
            {
                q.add(new Node(intervals[i][0],intervals[i][1]));
            }
            else if(q.peek().end>intervals[i][1])
            {
                Node n=q.poll();
                q.add(new Node(intervals[i][0],intervals[i][1]));
            }
        }
        return l-q.size();
    }
    class Node
    {
        int start;
        int end;
        Node(int start,int end)
        {
            this.start=start;
            this.end=end;
        }
    }
}