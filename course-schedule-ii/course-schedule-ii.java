class Solution {
    ArrayList<Integer> arr=new ArrayList<Integer>();
    public int[] findOrder(int numCourses, int[][] pre) {
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>(numCourses);
        int i,j,l=pre.length;
        for(i=0;i<numCourses;i++)
            a.add(new ArrayList<Integer>());
        for(i=0;i<l;i++)
        {
            a.get(pre[i][0]).add(pre[i][1]);
        }
        int vis[]=new int[numCourses];
        int ans[]=new int[numCourses];
        for(i=0;i<numCourses;i++)
        {
            if(vis[i]==0)
                if(topological(a,i,vis)==false)
                    return new int[0];
        }
        for(i=0;i<numCourses;i++)
            ans[i]=arr.get(i);
        return ans;
    }
    public boolean topological(ArrayList<ArrayList<Integer>> a,int i,int vis[])
    {
        if(vis[i]==1)
            return false;
        else
        {
            vis[i]=1;
            for(int j:a.get(i))
            {
                if(vis[j]!=2)
                    if(topological(a,j,vis)==false)
                        return false;
            }
            vis[i]=2;
            arr.add(i);
            return true;
        }
    }
}