package maharishi.recursions.easy;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factors(3));
    }

    private static int factors(int n) {
        if(n == 1){
            return n;
        }
        return n * factors(n-1);

    }
}
