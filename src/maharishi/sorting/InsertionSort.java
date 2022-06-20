package maharishi.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,7,1,5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        for (int i = 0; i < arr.length -1; i++) { // counter loop
            for (int j = i+1; j > 0; j--) { // inner for-loop to unsorted values
                int currentElement = arr[j];
                int previousElement = arr[j-1];
                if ( currentElement < previousElement ) {
                    swap(arr,j , j-1);
                } else {
                    break; // sort has complete
                }
            }
        }
    }

    private static void swap(int[] arr, int currentIndex, int previousIndex) {
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[previousIndex];
        arr[previousIndex] = temp;
    }
}
