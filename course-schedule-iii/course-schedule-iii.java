class Solution {
    public int scheduleCourse(int[][] courses) {
        int l=courses.length,i;
        Arrays.sort(courses,(a,b)->(a[1]-b[1]));
        PriorityQueue<c> p=new PriorityQueue<c>((a,b)->b.duration-a.duration);
        int time=0;
        for(i=0;i<l;i++)
        {
            if(time+courses[i][0]<=courses[i][1])
            {
                time=time+courses[i][0];
                p.add(new c(courses[i][0],courses[i][1]));
            }
            else if(p.size()!=0 && p.peek().duration>courses[i][0])
            {
                c course=p.poll();
                time=time-course.duration+courses[i][0];
                p.add(new c(courses[i][0],courses[i][1]));
            }
        }
        return p.size();
    }
    class c
    {
        int duration;
        int lastday;
        c(int d,int l)
        {
            duration=d;
            lastday=l;
        }
    }
}