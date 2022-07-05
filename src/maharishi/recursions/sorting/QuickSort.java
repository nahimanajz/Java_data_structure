package maharishi.recursions.sorting;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2,9,1};
        sort(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low, e = high, mid = s + (e-s) / 2, pivot = nums[mid];
        while(s <= e) {
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e]> pivot){
                e--;
            }
            if(s <= e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        // Now my pivot is at correct index please sort two halves
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
