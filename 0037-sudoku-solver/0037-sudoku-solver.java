class Solution {
    public static boolean isvalid(char[][] board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[i][col]==c) return false;
            if(board[row][i] == c) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c) return false;
        }
        return true;
    }
    public static boolean func(char [][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1' ;c<='9';c++){
                        if(isvalid(board,i,j,c)){
                            board[i][j]=c;
                            if(func(board)==true)
                                return true;
                            else
                                board[i][j]='.';
                        }
                    }
                    return false; // it was failed to fill the position
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        func(board);
    }
}