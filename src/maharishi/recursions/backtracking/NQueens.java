package maharishi.recursions.backtracking;


public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row){
        if(row == board.length){             // all the queens has placed
            display(board);
            return 1;
        }
        int count =0;
        // Placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;

    }

     static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) { // Means queen is already there
                return false;
            }
        }
        // diagonal left
        int maxLength = Math.min(row, col);
        for (int i = 1; i <= maxLength; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col -1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;

    }

    private static void display(boolean[][] board){
        for (boolean[] row: board ) {
            for (boolean element : row  ) {
                if (element){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
