class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows= new HashSet[9];
        HashSet<Character>[] cols= new HashSet[9];
        HashSet<Character>[] boxs= new HashSet[9];


            for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxs[i] = new HashSet<>();
        }

        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                char dig= board[i][j];

                if(dig=='.')continue;
                int box =(i/3)*3 +(j/3);

if (rows[i].contains(dig) ||
    cols[j].contains(dig) ||
    boxs[box].contains(dig)) {
    return false;
}
                rows[i].add(dig);cols[j].add(dig);boxs[box].add(dig);

            }
        }

        return true;
    }
}
