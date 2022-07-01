package maharishi.recursions.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[]first, int[] last){
        int[] mix = new int[first.length + last.length];
        int i=0, j=0, k=0;

        while(i< first.length && j < last.length){ // checking till any of the sub-arrays runs out of bound
            if(first[i] < last[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = last[j];
                j++;
            }
            k++;
        }
        // In case one sub-array is not complete ex: arr1 = [3,4,1] whilst arr2 = [8,6,9,7] Then
        // Add remaining parts of the arrays
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < last.length){
            mix[k] = first[j];
            j++;
            k++;
        }
      return mix;
    }
}
