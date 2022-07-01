package maharishi.recursions.patterns;

import java.util.Arrays;



public class Triangle {

    public static void main(String[] args) {
        triangle(4, 0);
        int[] arr = {4,3, 2,1};
        bubbleSort(arr, arr.length -1,  0);
        System.out.println("Bubble sort solution:" +Arrays.toString(arr));

        //selection
        selection(arr, arr.length,  0, 0);
        System.out.println("Selection sort solution: " +Arrays.toString(arr));
    }

    /**
     *
     * @param arr
     * @param row
     * @param col
     * @param max
     * Save index which has maximum Number at specific column or set max tobe the column that has the largest number
     */
    private static void selection(int[] arr, int row, int col, int max){ // it takes maximum index and replace it with
        if (row == 0) {
            return;
        }
        if(col < row) {
            if (arr[col] > arr[max]) {
                selection(arr, row, col + 1, col);
            } else {
                selection(arr, row, col + 1, max);
            }
        } else {
            // {5,4,9,1} ==>{1,4,9,5}
            int temp = arr[max];
            arr[max] = arr[row -1];
            arr[row-1] = temp;
             selection(arr, row -1, 0, 0);
        }
    }
    private static void bubbleSort(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row){
            if (arr[col] > arr[col+1]) {
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bubbleSort(arr, row, col+1);
        } else {
            bubbleSort(arr, row-1, 0);
        }
    }

    private static void triangle(int row, int col) {
        if(row == 0){
            return;
        }
        if(col< row){
            System.out.print("*");
            triangle(row, col+1);
        } else{
            System.out.println();
            triangle(row-1, 0);
        }

    }
    
}
