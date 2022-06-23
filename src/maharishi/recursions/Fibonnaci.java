package maharishi.recursions;

public class Fibonnaci {
    public static void main(String[] args) {
        //System.out.println(fibo(3));
       /* for (int i = 0; i < 11; i++) {
            System.out.println(fiboFormulla(i));
        }
        */
        System.out.println(fiboFormulla(50));

    }
    private static int fiboFormulla(int n) {
        return (int)(Math.pow( ((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
    private static int fibo(int n) {
        if(n < 2) {
            return  n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
