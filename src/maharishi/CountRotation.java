package maharishi;


public class CountRotation {
    public static void main(String[] args) {
    int[] arr = {4,5,6,7,8,19, 12,0};
        System.out.println(rotationCounter(arr));
    }

    private static int rotationCounter(int[] arr) {
        // pivot is the  index where maximum index is located, then number of pivot is pivot plus one.
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    private static int findPivot(int[] arr) {
        int start = 0, end = arr.length -1;
        while(start <= end) {
            int mid = start + (end -start) /2;
           // 4 cases for finding pivot
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid -1]) {
                return mid - 1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return -1; // since end <= start then return any of these two variable
    }

}
