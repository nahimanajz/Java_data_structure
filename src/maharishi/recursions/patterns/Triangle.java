package maharishi.recursions.patterns;

import java.util.Arrays;

public class Triangle {

    public static void main(String[] args) {
        triangle(4, 0);
        int[] arr = {4,3, 2,1};
        bubbleSort(arr, arr.length -1,  0);
        System.out.println(Arrays.toString(arr));
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
