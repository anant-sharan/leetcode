import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int i,j;
        for(i=0;i<9;i++)
        {
            Hashtable<Character,Integer> rows=new Hashtable<Character,Integer>();
            Hashtable<Character,Integer> cols=new Hashtable<Character,Integer>();
            for(j=0;j<9;j++)
            {
                if(Character.isDigit(board[i][j]))
                {
                    if(rows.containsKey(board[i][j]))
                        return false;
                    else
                        rows.put(board[i][j],0);
                }
                if(Character.isDigit(board[j][i]))
                {
                    if(cols.containsKey(board[j][i]))
                        return false;
                    else
                        cols.put(board[j][i],0);
                }
                if(i%3==0 && j%3==0)
                {
                    if(check(board,i,j)==false)
                        return false;
                }
            }
        }
        return true;
    }
    public boolean check(char b[][],int r,int c)
    {
        Hashtable<Character,Integer> h=new Hashtable<Character,Integer>();
        int i,j;
        for(i=r;i<=r+2;i++)
        {
            for(j=c;j<=c+2;j++)
            {
                if(Character.isDigit(b[i][j]))
                {
                    if(h.containsKey(b[i][j]))
                        return false;
                    else
                        h.put(b[i][j],0);
                }
            }
        }
        return true;
    }
}