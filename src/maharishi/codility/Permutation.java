package maharishi.codility;

import java.util.Arrays;

public class Permutation {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int count = 1;
        int i=0;
        while(i < A.length){
            if(A[i] != count){
                return count;
            }
            count++;
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2, 4};
       // Permutation.solution(arr);
        System.out.println(Permutation.solution(arr));
    }
}
