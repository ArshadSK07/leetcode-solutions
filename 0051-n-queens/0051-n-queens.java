class Solution {
    public static boolean ispossible(char[][] board , int row, int col){
        int i=row;
        while(i>=0){
            if(board[i][col]=='Q') return false;
            i--;
        }
        i=row;
        int j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        i=row;
        j=col;
        while(i>=0 && j<board.length){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        return true;
    }
    public static void func(int row,List<List<String>> ans , char[][] board ){
        if(row==board.length){
            List<String> currentBoard = new ArrayList<>();
            for (char[] r : board) {
                currentBoard.add(new String(r));
            }
            ans.add(currentBoard);
            return;
        }
        for(int i=0;i<board.length;i++){
            
            if(ispossible(board,row,i)==true){
                board[row][i] = 'Q';
                func(row+1,ans,board);
                board[row][i] = '.';
            }
        }
        return;

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        func(0,ans,board);
        return ans;
    }
}