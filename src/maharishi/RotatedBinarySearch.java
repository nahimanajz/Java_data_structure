package maharishi;

public class RotatedBinarySearch {
    public static int findPivot(int[] arr){ // the most maximum number
        int start =0, end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start) /2;
           // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) { //pivot is exactly at mid position
               return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) { // we are looking on left side
                return mid -1;
            }
            if(arr[mid] <= arr[start]){ // check pivot existence on left side
                end = mid -1;
            } else { // check pivot existence on right side
                start  = mid +1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr =  {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr));
    }
}
