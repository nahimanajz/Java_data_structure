package maharishi;
// it runs log(n)
public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int target = 36;
        System.out.println(binarySearch(arr, target));
    }

    // It has to work on sorted array
    private static int binarySearch(int[] arr, int target) {
        int start =0, end = arr.length -1 ;
        while(start < end) {
            int mid =  start + (end - start) / 2;
            if(arr[mid] == target) { // medium is exactly the
                return mid;
            } else if (target > arr[mid]) { // search on the right part of the array
                start = mid+1;
            } else if(target < arr[mid]) { // search on the left part of the array
                end = mid -1;
            }
        }
        return -1;
    }
}
