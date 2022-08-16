package maharishi.codility;

import java.util.Arrays;

public class RotateKtime {
    public  static int[] rotate(int[] A, int n, int K){
        int[] rotated = new int[A.length];
        for(int i= 0; i < A.length; i++){

            if(i<K) {
               rotated[i] = A[n+i-K];
            }else {
                rotated[i] = A[i-K];
            }

        }
        return rotated;
    }

    public static void main(String[] args) {
        int[] A= {3, 8, 9, 7, 6};
        int[] rotated = RotateKtime.rotate(A, A.length, 3);
        System.out.println(Arrays.toString(rotated));

    }
}
