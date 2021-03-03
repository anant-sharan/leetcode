import java.io.*;
import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        Hashtable<Integer,Integer> row=new Hashtable<Integer,Integer>();
        Hashtable<Integer,Integer> col=new Hashtable<Integer,Integer>();
        int i,j,l1=matrix.length,l2=matrix[0].length;
        for(i=0;i<l1;i++)
        {
            for(j=0;j<l2;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.put(i,0);
                    col.put(j,0);
                }
            }
        }
        for(i=0;i<l1;i++)
        {
            for(j=0;j<l2;j++)
            {
                if(row.containsKey(i) || col.containsKey(j))
                    matrix[i][j]=0;
            }
            
        }
    }
}