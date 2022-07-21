package maharishi.exercise;
// it is an array which contains only odd or even elements
public class DaphneArray {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4}; // not daphne
        int[] daphne1 = {2, 4}; //  daphne
        int[] daphne2 = {3, 5}; //  daphne
        System.out.println(isDaphne(arr));
    }
    static boolean isDaphne(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            if((arr[i -1] % 2 == 0 && arr[i] % 2 != 0) || (arr[i -1] % 2 != 0 && arr[i] % 2 == 0)){
                return false;
            }

        }
        return true;
    }
}
