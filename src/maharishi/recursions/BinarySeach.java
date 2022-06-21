package maharishi.recursions;

public class BinarySeach {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,5};
        int target = 5;
        System.out.println(search(arr, target, 0, arr.length -1));
    }

    private static int search(int[] arr, int target, int startIndex, int endIndex) {
        if(startIndex > endIndex) {
            return -1;
        }
        int midIndex = startIndex + (endIndex - startIndex) / 2;
        if(arr[midIndex] == target) {
            return  midIndex;
        }
        if(arr[midIndex] > target) { // search in right side
            return  search(arr, target,startIndex, midIndex -1);
        } else if (arr[midIndex] < target ) {
            return search(arr, target, midIndex +1, endIndex);
        }
        return  -1;  // Element not found

    }

}
