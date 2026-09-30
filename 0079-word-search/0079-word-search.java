class Solution {
    public static boolean func(int idx,int i,int j,String word, char[][] board){
        if(idx==word.length()) return true;
        if(i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length || board[i][j]=='\0' || board[i][j]!=word.charAt(idx)) return false;
        char temp=board[i][j];
        board[i][j]='\0';
        boolean ans =
            func(idx + 1, i - 1, j, word, board) || // top
            func(idx + 1, i + 1, j, word, board) || // bottom
            func(idx + 1, i, j - 1, word, board) || // left
            func(idx + 1, i, j + 1, word, board);    // right
        board[i][j]=temp;
        return ans;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
                if(board[i][j]==word.charAt(0))
                    if(func(0,i,j,word,board)==true)
                        return true;
        return false;
    }
}