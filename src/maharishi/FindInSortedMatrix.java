package maharishi;

import java.util.Arrays;

public class FindInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2, 3,4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 109;
        System.out.println(Arrays.toString(search(matrix,target)));
    }
    // search in the row provided between columns provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid+1; // search on right-hand side
            }else {
                cEnd  = mid - 1; // search in left hand side

            }
        }
        return  new int[]{-1, -1}; // target is not found

    }
    static  int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (rows == 1) {
            return binarySearch(matrix, 0,0, cols-1,target);
        }
        int rStart =0;
        int rEnd = rows -1;
        int cMid = cols / 2; // Medium Column
        // performing binary search in the middle column,
        // run sear ch till just two rows are remaining
        while(rStart < rEnd -1) { // while this is true it will have more 2  rows to eliminate
            int midRow = rStart + (rEnd -rStart) /2; // medium row since we want to eliminate rows;
            if (matrix[midRow][cMid] == target) {
                return new int[] {midRow, cMid};
            }
            if (matrix[midRow][cMid] < target) {
                rStart = midRow; // ignore top rows
            } else {
                rEnd = midRow ; // ignore bottom rows
            }
        }
        // once above loop is complete we remain with two rows
        // check whether target is in the column of two rows
        if (matrix[rStart][cMid] == target) {
            return new int[] {rStart, cMid};
        }
        // check whether target is in the column of t

        if (matrix[rStart + 1][cMid] == target) { // check end row which is equal to rowStart + 1
            return new int[] {rStart + 1, cMid};
        }
        /* midCol [2, 6]
        |1|2|3|4
        |5|6|7|8|
         */

        // Search in 1st half
        if(target <= matrix[rStart][cMid -1]){
            return binarySearch(matrix, rStart, 0, cMid -1, target);
        }
        // Search in 2nd half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols -1]){
            return binarySearch(matrix, rStart,cMid +1, cols -1, target);
        }
        // Search in 3rd half
        if(target <= matrix[rStart + 1][cMid -1]){
           return binarySearch(matrix, rStart +1, 0, cMid -1, target);
        } else {
            return binarySearch(matrix, rStart +1, cMid +1, cols -1, target);
        }


    }
}
