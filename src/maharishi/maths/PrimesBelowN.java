package maharishi.maths;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrimesBelowN {
    public static void main(String[] args) {
        int n = 40; //1......37 primes
        boolean[] primes = new boolean[1 + n];  // default false, 41 false elements
        System.out.println(primes.length);
        sieve(n, primes);
    }

    private static void sieve(int n, boolean[] primes) {
        for (int i = 2; i*i <= n; i++) {
            if (!primes[i]) {
                for (int j = i*2; j <=n ; j=j+i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (!primes[i]){
                System.out.println(i+ "");
            }
        }
    }
}
