class Solution {
   static List<List<String>> f=new ArrayList<List<String>>();
    public List<List<String>> solveNQueens(int n) {
        f.clear();
        int a[][]=new int[n][n];
	    placequeens(a,0,n);
        return f;
    }
      public static void placequeens(int a[][],int row,int n)
  {
	  
      if(row==n)
      {
    	  display(a,n);
      }
      
      for(int j=0;j<n;j++)
      {
          if(ispossible(a,row,j,n))
          {
              a[row][j]=1;
              placequeens(a,row+1,n);
              a[row][j]=0;
          }
          
      
      
      }
      
  }
  public static boolean ispossible(int a[][],int row,int column,int n)
  {
      boolean x=true;
      int i,j;
      for( i=row-1;i>=0;i--)
      {
          if(a[i][column]==1)
              return false;
      }
      for(i=row-1,j=column-1;i>=0 && j>=0;i--,j--)
      {
          if(a[i][j]==1)
              return false;
      }
      for(i=row-1,j=column+1;i>=0 && j<n;i--,j++)
      {
          if(a[i][j]==1)
              return false;
      }
      return true;
  }
    public static void display(int c[][],int n)
  {
      
      List<String> l=new ArrayList<String>();
      for(int i=0;i<n;i++)
	  {
    	  
    	  String s="";
		  for(int j=0;j<n;j++)
		  {
			  if(c[i][j]==0)
				  s=s+".";
			  else
				  s=s+"Q";
		  }
		  l.add(s);
	  }
      f.add(l);
      
      
  }
}