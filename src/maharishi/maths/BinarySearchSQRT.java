package maharishi.maths;

public class BinarySearchSQRT {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.printf("%.3f", sqrt(n, p));
    }
    //Time: 0(log(n))
    private static double sqrt(int n, int p) {
        int start = 0;
        int end = n;
        double sqrRoot =  0.0;
        while (start <= end) {
            int mid = start + (end- start) / 2;
            if(mid * mid ==  n) {
                return mid;
            }
            if( mid * mid < n) {
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while(sqrRoot * sqrRoot <= n){
                sqrRoot +=incr;
            }
            sqrRoot -=incr;
            incr/=10; // to show number after comma

        }
        return  sqrRoot;
    }
}
