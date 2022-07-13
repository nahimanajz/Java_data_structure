package maharishi.recursions.backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board =  {
                            { true, true, true},
                            {true, true, true},
                            {true, true, true}
        };
       // allPath("", board, 0, 0); // stack overflow due aka infinite recursion
       // pathBacktrack("", board, 0, 0);

        int[][] paths = new int[board.length][board[0].length];
        matrixAndPaths("", board, 0, 0, 1, paths);
    }
    static void matrixAndPaths(String path, boolean[][] board, int row, int col, int step, int[][] paths){
        if (row == board.length -1 && col == board[0].length -1) {
            paths[row][col] = step;
            for (int[] arr: paths) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(path);
            System.out.println();
            return;

        }
        if (!board[row][col]) {
            return;
        }

        board[row][col] = false;
        paths[row][col] = step;
        if (row < board.length -1) {
            matrixAndPaths(path + "D", board, row + 1, col, step+1, paths);
        }

        if (col < board[0].length -1) {
            matrixAndPaths(path + "R", board, row, col +1, step+1, paths);
        }
        if (col > 0) {
            matrixAndPaths(path + "L", board, row, col -1, step+1, paths);
        }
        if (row > 0) {
            matrixAndPaths(path + "D", board, row -1, col, step+1, paths);
        }
        board[row][col] = true;
        paths[row][col] = 0;

    }
    private static void pathBacktrack(String path, boolean[][] board, int row, int col) {
        if(row == board.length -1 && col == board[0].length -1){
            System.out.println(path);
            return;
        }
        if(!board[row][col]){
            return;
        }
        // update visited cell to false
        board[row][col] = false;

        if (row < board.length -1) {
            pathBacktrack(path+"D", board,row +1,col);
        }
        if (col < board[0].length -1) {
            pathBacktrack(path+"R", board, row, col+1);
        }
        if (row > 0) {
            pathBacktrack(path+"U", board, row-1, col);
        }
        if (col > 0) {
            pathBacktrack(path+"L", board, row, col-1);
        }
        // Run this line when the function is over
        // when the function is removed, the update all reset all paths.
        board[row][col] = true;


    }

    /**
     *
     * @param path
     * @param board
     * @param row
     * @param col
     * Run recursion in all direction [Down, right, Left, up]
     */
     static void allPaths(String path, boolean[][] board,  int row, int col) {
        if(row == board.length -1 && col == board[0].length -1){
            System.out.println(path);
            return;
        }
        if(!board[row][col]){
            return;
        }


         if (row < board.length -1) {
             allPaths(path+"D", board,row + 1, col);
         }
         if (col < board[0].length -1) {
             allPaths(path + "R", board, row, col+1);
         }

         if (row > 0) {
             allPaths(path+"U", board, row-1, col);
         }
         if (col > 0) {
             allPaths(path+"L", board, row, col-1);
         }
    }

}
