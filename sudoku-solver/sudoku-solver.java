class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char board[][])
    {
        int i,j;
        char k;
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(k='1';k<='9';k++)
                    {
                        if(isvalid(board,i,j,k))
                        {
                            board[i][j]=k;
                            if(solve(board)==true)
                                return true;
                            else
                                board[i][j]='.';
                        }
                    }
                        return false;
                }
            }
        }
        return true;
    }
    public boolean isvalid(char board[][],int row,int col,char ch)
    {
        int i,j;
        for(i=0;i<9;i++)
        {
            if(board[row][i]==ch)
                return false;
            if(board[i][col]==ch)
                return false;
        }
        int r=3*(row/3);
        int c=3*(col/3);
        for(i=r;i<r+3;i++)
        {
            for(j=c;j<c+3;j++)
            {
                if(board[i][j]==ch)
                    return false;
            }
        }
        return true;
    }
}