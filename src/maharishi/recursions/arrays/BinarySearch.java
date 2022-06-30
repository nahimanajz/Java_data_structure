package maharishi.recursions.arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int target = 3;
        int[] arr = {5, 6,2, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, target, 0, arr.length -1));
    }
    private static int search(int[] arr, int target, int startIndex, int endIndex) {
        if(startIndex > endIndex){
            return -1;
        }
        int mid = startIndex + (endIndex - startIndex)/ 2;
        if (arr[mid] == target){
            return  mid;
        }
       // search in left side
        if(arr[startIndex] <= arr[mid]){
            if (arr[startIndex] <= target && target <= arr[mid]) {
                return search(arr, target, startIndex, mid-1);
            } else {
                return search(arr, target, mid+1, endIndex);
            }
        }
        //search in right side
        if (arr[mid] <= target && arr[endIndex] >= target) {
            return  search(arr, target,mid+1, endIndex);
        }
        return search(arr, target,startIndex, mid-1);
        
    }
}
