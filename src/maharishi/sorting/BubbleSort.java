package maharishi.sorting;

import java.util.Arrays;
// Bubble sort compares two respective elements in array
public class  BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4, 2, 1};
        System.out.println(Arrays.toString(sort(arr)));

    }
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp =  arr[j-1];
                    arr[j-1] =  arr[j];
                    arr[j] = temp;
                }

            }

        }
        return arr;
    }
}
