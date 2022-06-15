package maharishi;


public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 100;
        System.out.println(ans(arr, target)); //
    }
    static int ans(int[] arr, int target){
        int start =0, end =1;
        // check whether target lies in the range
        while(target > arr[end]) {
            int temp = end +1; // this is my new start,
            // double the box value
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
    while(start <= end){
        int mid = start + (end - start) / 2;
        if(target < arr[mid]) {
            end = mid -1;
        } else if (target> arr[mid]) {
         start = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;
    }
}

