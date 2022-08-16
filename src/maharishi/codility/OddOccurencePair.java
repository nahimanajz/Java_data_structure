package maharishi.codility;

import java.util.Arrays;

public class OddOccurencePair {
    public int[] swap(int[] A) {

        for(int i=0; i<A.length-1; i++){
            if(A[i] < A[i+1]){
                int temp = A[i];
                A[i] = A[i+1];
                A[i+1] = temp;
            }
        }
        return A;
    }
    public int solution(int[] A) {

        int answ = 0;
        for(int j=0; j< A.length -1; j=j+2){
            if(A[j] !=A[j+1]){
                answ = A[j];
            }
        }
        return answ;

    }

    public static void main(String[] args) {
        OddOccurencePair sol = new OddOccurencePair();
        int[] arr = {9, 3, 9, 3, 9, 7, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // CHECK ODDS
        System.out.println(sol.solution(arr));
    }
}
