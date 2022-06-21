package maharishi.recursions;

public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(fibo(3));
    }

    private static int fibo(int n) {
        if(n < 2) {
            return  n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
