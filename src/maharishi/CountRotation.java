package maharishi;


public class CountRotation {
    public static void main(String[] args) {
    int[] arr = {4,5,6,7,0,1, 2};
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
            if(arr[mid] < arr[mid + 1]) {
                start = mid +1;
            }else if (arr[mid] > arr[mid]) {
                end = mid - 1;
            } else {
                return  mid;
            }
        }
        return end; // since end <= start then return any of these two variable
    }

}
