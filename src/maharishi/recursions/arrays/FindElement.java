package maharishi.recursions.arrays;
//Binary search
public class FindElement {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,6,5};
        int target = 6;
        System.out.println(getElement(arr, 0, target));
        System.out.println(findIndex(arr, 0, target));

    }

    private static boolean getElement(int[] arr, int index, int target) {
        if(index == arr.length -1){
            return false;
        }
        return target == arr[index] ||  getElement(arr, index+1, target);
    }
    private static int findIndex(int[] arr, int index, int target) {
        if(index == arr.length -1){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        return findIndex(arr, index + 1, target);
    }
}
