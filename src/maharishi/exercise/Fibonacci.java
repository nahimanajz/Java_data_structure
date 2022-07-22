package maharishi.exercise;

public class Fibonacci {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 8, 13, 21};
        int result =1; // it is fibonacci
        for (int i = 2; i < arr.length; i++) {
            int tempSum = arr[i-2] +arr[i -1];
            if(arr[i] != tempSum){
                result =0;
                break;
            }
            result = 1;
        }
        System.out.println(result);
    }
}
