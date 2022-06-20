package maharishi.sorting;
// Selection sort find item and put to the correct index
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,7,1,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    private static int getMaxIndex(int[] arr, int startIndex, int endIndex) {
        int max = startIndex;
        for (int i = startIndex; i <= endIndex ; i++) {
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }


}
