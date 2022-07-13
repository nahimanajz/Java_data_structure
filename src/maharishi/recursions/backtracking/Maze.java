package maharishi.recursions.backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(maze(3, 3));
        mazePath("", 3,3);
        System.out.println(diagonal("", 3, 3));

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        stopOnLake("", board,0,0);
    }
    static int maze(int row, int col){
        if(row == 1 || col == 1){
            return  1;
        }
        int right = maze(row, col-1);
        int down = maze(row-1, col);
        return right + down;
    }
    static  void mazePath(String path, int col, int row) {
        if(row == 1 &&  col == 1){
            System.out.println(path);
            return;
        }
        if(row > 1) mazePath(path + 'D', col, row -1);
        if(col > 1) mazePath(path + 'R', col -1, row);

    }
    static ArrayList<String> diagonal(String path, int col, int row){
        if(row == 1 && col == 1){
         ArrayList<String> ans = new ArrayList<>();
         ans.add(path);
         return ans;
        }
        ArrayList<String> list = new ArrayList<>();
       if(row > 1 && col > 1){
           list.addAll(diagonal(path+"D", col -1, row -1)); // diagonal
       }
       if(row > 1){
           list.addAll(diagonal(path+"V", col, row -1)); //down
       }
        if (col > 1) {
            list.addAll(diagonal(path+"H", col -1, row)); // right

        }
        return list;

    }

    /**
     *
     * @param path
     * @param board and middle cell is treated as lake thereby it is set to false and excution has to stop right there
     * @param row
     * @param col
     */
    static void stopOnLake(String path, boolean board[][], int row, int col) {
        if(row == board.length -1 && col == board[0].length -1){
            System.out.println(path);
            return;
        }
        if(!board[row][col]){
            return;
        }
        if (col < board[0].length -1){
            stopOnLake(path + "R", board, row, col +1);
        }
        if(row < board.length -1){
            stopOnLake(path + "D", board, row+1, col);
        }
    }
}
