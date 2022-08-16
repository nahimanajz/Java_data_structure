package maharishi.codility;

public class CountingDiv {
    public static int countDiv(int A, int B, int K){
        // write your code in Java SE 8
      /*  A and B are integers within the range [0..2,000,000,000];
            K is an integer within the range [1..2,000,000,000];
          A ≤ B.
        */
       int count = (B-A) / K;
       if((A%K == 0) || (B%K == 0)) count++;
       return count;
    }

    public static void main(String[] args) {
        System.out.println(CountingDiv.countDiv(6, 11, 2));
    }
}

