// brute force: literally check all O(n^2)
// use hashsets to check - row, column, 3x3 box. 3 methods and call in main method. 

class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        return checkRow(board) && checkColumn(board) && checkBox(board);
    }

    // check row
    public boolean checkRow(char[][] board){
        for (int i = 0; i < board.length; i++){
            Set<Character> set = new HashSet<>();
            
            for (int j = 0; j < board.length; j++){
                if (board[i][j] == '.') continue; 
                else if (set.contains(board[i][j])) return false; 
                else set.add(board[i][j]);
            }
        }
        return true; 
    }

    // check column
    public boolean checkColumn(char[][] board){
        for (int i = 0; i < board.length; i++){
            HashSet<Character> set = new HashSet<>();
        
            for (int j = 0; j < board.length; j++){
                if (board[j][i] == '.') continue;
                else if (set.contains(board[j][i])) return false; 
                else set.add(board[j][i]); 
            }
        }
        return true; 
    }

    // check box
    public boolean checkBox(char[][] board){
        for (int i = 0; i < 9; i += 3){ // starting row of box
            for (int j = 0; j < 9; j += 3){ // starting column of box
                Set<Character> set = new HashSet<>();

                for (int m = 0; m < 3; m++){ // inside the box, row
                    for (int n = 0; n < 3; n++){ // inside the box, column
                        if (board[m+i][n+j] == '.') continue;
                        else if (set.contains(board[m+i][n+j])) return false; 
                        else set.add(board[m+i][n+j]); 
                    }
                }
            }
        }
        return true; 
    }
}
