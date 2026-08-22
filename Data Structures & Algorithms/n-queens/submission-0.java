class Solution {

    public boolean isSafe(List<String> board, int row, int col, int n) {
        // check column above
        for (int i = 0; i < row; i++) {
            if (board.get(i).charAt(col) == 'Q') return false;
        }
        // check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') return false;
        }
        // check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q') return false;
        }
        return true;
    }

    public void nQueen(List<String> board, int row, int n, List<List<String>> ans) {
        if (row == n) {
            ans.add(new ArrayList<>(board)); // copy, since board keeps mutating
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j, n)) {
                char[] rowChars = board.get(row).toCharArray();
                rowChars[j] = 'Q';
                board.set(row, new String(rowChars));

                nQueen(board, row + 1, n, ans);

                rowChars[j] = '.';
                board.set(row, new String(rowChars));
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(".".repeat(n));
        }

        List<List<String>> ans = new ArrayList<>();
        nQueen(board, 0, n, ans);
        return ans;
    }
}