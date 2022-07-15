package maharishi.recursions.backtracking;
// https://leetcode.com/problems/sudoku-solver/
public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][] {
                    {5,3,0,0,7,0,0,0,0},
                    {6,0,0,1,9,5,0,0,0},
                    {0,9,8,0,0,0,0,6,0},
                    {8,0,0,0,6,0,0,0,3},
                    {4,0,0,8,0,3,0,0,1},
                    {7,0,0,0,2,0,0,0,6},
                    {0,6,0,0,0,0,2,8,0},
                    {0,0,0,4,1,9,0,0,5},
                    {0,0,0,0,8,0,0,7,9}
                };
        if (solve(board)) {
            display(board);
        }else {
            System.out.println("Can not solve");
        }

    }

    private static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        //This is how we are replacing the r, c from arguments
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            // if you found some empty element in row then break
            if (emptyLeft == false) {
                break;
            }

        }
        if(emptyLeft == true){
            return true;
            // sudoku is solved
        }
        //backtrack
        for (int number = 1; number < 9 ; number++) {
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                if(solve(board)){
                    // found answer
                    display(board);
                    return true;
                } else {
                    // backtrack
                    board[row][col] = 0;
                }
            }

        }
        return  false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int number) {
        // check the row
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if(board[row][col] ==  number){
                return false;
            }
        }
        // check the column
        for (int[] numbers : board) {
            // check if the number is in the col
            if(numbers[col] == number) {
                return false;
            }
        }
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row/ sqrt;
        int colStart = col -col/ sqrt;

        // check the box
        for (int boxRow = rowStart; boxRow < rowStart + sqrt; boxRow++) {
            for (int boxCol = 0; boxCol < colStart + sqrt; boxCol++) {
                if(board[boxRow][boxCol] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void display(int[][] board) {
        for (int[] row: board) {
            for(int num: row){
                System.out.println(num + " ");
            }
        }
    }

}
