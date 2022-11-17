class Solution {
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<List<String>>();
        char[][] board = new char[n][n];
        
        helper(allBoards, board, 0); //Passing the row number
        
        return allBoards;
    }
    
    public void helper(List<List<String>> allBoards, char[][] board, int row){
        if(row == board.length){
            saveBoard(allBoards, board);
            return;
        }
        
        for(int col = 0; col<board.length; col++){
            if(isSafe(board, row, col)){//If it is safe to place queen on this board at board[row][col]
                board[row][col] = 'Q';
                helper(allBoards, board, row+1);
                board[row][col] = '.'; //This is backtracking
            }
        }
    }
    
    public void saveBoard(List<List<String>> allBoards, char[][] board){
        List<String> newBoard = new ArrayList<String>();
        
        for(int i=0; i<board.length; i++){
            
            //Each string here represents one row hence first, we will create n strings and add them to our arraylist newBoard. Then we will add this newBoard to our allBoards.
            String oneRow = "";
            
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j]=='Q'){
                    oneRow += "Q";
                }else{
                    oneRow += ".";
                }
            }
            newBoard.add(oneRow);
        }
        
        allBoards.add(newBoard);
    }
    
    public boolean isSafe(char[][] board, int row, int col){
        //Horizontal - Checking in each column of given row
        for(int i = 0; i< board.length; i++){ //Can also write board[0].length but doesn't matter as baord is a square and both are same
            if(board[row][i]=='Q') return false;
        }
        
        //Vertical - Checking in each row of given column
        for(int i = 0; i< board.length; i++){ 
            if(board[i][col]=='Q') return false;
        }
        
        //Upper Left
        for(int i=row, j=col; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q') return false;
        }
        
        //Upper Right
        for(int i=row, j=col; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q') return false;
        }
        
        //Lower Left
        for(int i=row, j=col; i<board.length && j>=0; i++, j--){
            if(board[i][j]=='Q') return false;
        }
        
        //Lower Right
        for(int i=row, j=col; i<board.length && j<board.length; i++, j++){
            if(board[i][j]=='Q') return false;
        }
        
        return true;
    }
    
}