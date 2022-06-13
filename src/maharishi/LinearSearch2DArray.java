package maharishi;

import java.util.Arrays;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        int [][]  numbers =  {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        int target = 34;
        int[] ans = search(numbers, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] numbers, int target) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if(numbers[row][col] == target) {
                    return  new int[]{row, col};
                }

            }

        }
        return new int[] {-1, -1}; // item wasn't found
    }
}
