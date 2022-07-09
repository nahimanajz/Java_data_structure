package maharishi.recursions.backtracking;

public class Maze {
    public static void main(String[] args) {
        System.out.println(maze(3, 3));
    }
    static int maze(int row, int col){
        if(row == 1 || col == 1){
            return  1;
        }
        int right = maze(row, col-1);
        int down = maze(row-1, col);
        return right + down;
    }
}
