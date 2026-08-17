class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i ++){
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i ++){
            for (int j = 0; j < 9; j ++){
                char value = board[i][j];
                if (value == '.') continue; 

                int boxGroup = ((i / 3) * 3) + (j / 3);
                
                if (rows[i].contains(value) || columns[j].contains(value)|| boxes[boxGroup].contains(value)){
                    return false;
                }

                rows[i].add(value);
                columns[j].add(value);
                boxes[boxGroup].add(value);
                    
                
            }
        }

        return true;
    }
}
