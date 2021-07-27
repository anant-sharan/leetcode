class Solution {
    public int orangesRotting(int[][] grid) {
        int i,j,r=grid.length,c=grid[0].length,max=0;
        Queue<Node> q=new LinkedList<Node>();
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(grid[i][j]==2)
                    q.add(new Node(i,j,0));
            }
        }
        while(q.size()!=0)
        {
            int l=q.size();
            while(l>0)
            {
                --l;
                Node n=q.poll();
                if(n.row!=0)
                {
                    if(grid[n.row-1][n.col]==1)
                    {
                        grid[n.row-1][n.col]=2;
                        q.add(new Node(n.row-1,n.col,n.level+1));
                        max=Math.max(max,n.level+1);
                    }
                }
                if(n.col!=0)
                {
                    if(grid[n.row][n.col-1]==1)
                    {
                        grid[n.row][n.col-1]=2;
                        q.add(new Node(n.row,n.col-1,n.level+1));
                        max=Math.max(max,n.level+1);
                    }
                }
                if(n.row!=r-1)
                {
                    if(grid[n.row+1][n.col]==1)
                    {
                        grid[n.row+1][n.col]=2;
                        q.add(new Node(n.row+1,n.col,n.level+1));
                        max=Math.max(max,n.level+1);
                    }
                }
                if(n.col!=c-1)
                {
                    if(grid[n.row][n.col+1]==1)
                    {
                        grid[n.row][n.col+1]=2;
                        q.add(new Node(n.row,n.col+1,n.level+1));
                        max=Math.max(max,n.level+1);
                    }
                }
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return max;
    }
    class Node
    {
        int row,col,level;
        Node(int row,int col,int level)
        {
            this.row=row;
            this.col=col;
            this.level=level;
        }
    }
}