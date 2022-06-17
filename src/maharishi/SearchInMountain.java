package maharishi;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr ={0,1,2,4,2,1};
        int target = 3;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBs(arr, target, 0, peak); // peak is the end of our sub array
        if (firstTry != -1) {
            return firstTry;
        }
        // search in second half
        return orderAgnosticBs(arr, target, peak, arr.length -1);
    }
    private static int orderAgnosticBs(int[] arr, int target, int startIndex, int endIndex) {
        // find whether array is sorted in ascending or descending order
        boolean isAsc = arr[startIndex] < arr[endIndex];
        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex -startIndex) / 2;
            if(arr[mid]  == target){
                return mid;
            } else{
                startIndex = mid +1;
            }
            if(isAsc) {
                if (target > arr[mid]) {
                    endIndex = mid -1;
                } else {
                    startIndex = mid +1;
                }
            }
        }
        return -1;
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length -1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid +1;
            }
        }
        return start;
    }
}
