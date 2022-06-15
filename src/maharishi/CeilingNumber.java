package maharishi;

public class CeilingNumber{
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 22, 45, 89};
        int target = 22;

        System.out.println(ceiling(arr, target));

    }
    // num >= target,
    public static int ceiling(int[] arr, int target) {
        int start =0, end = arr.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2; // ex: 0 + (end - 0)/2
            if(target < arr[mid]) {
                end = mid - 1; // Search on left side of array
            } else if (target > arr[mid]) {
                start = arr[mid] + 1;  // search in right part
            } else {
                return mid; // midIndex is exactly the same as our target index
            }
        }
        return start; // starting index here is the greater than mid, and end;
    }
}
