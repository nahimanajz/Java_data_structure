package maharishi;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class FindPeekElement {
    public static void main(String[] args) {
        int[] arr = {9,2};
        System.out.print(getHorizon(arr));
    }

    private static int getHorizon(int[] arr) {
        int start = 0, end = arr.length -1;
        while(start < end) {
            int mid = start + (end - start) /2;
            if (arr[mid] > arr[mid +1]) {
                end = mid;
            } else {
                  start = mid + 1 ;
            }
        }
        return end;
    }

}
