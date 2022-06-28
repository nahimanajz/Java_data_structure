package maharishi.recursions.easy;

public class ReversingNumber {
    public  static int sum = 0;

    public static void main(String[] args) {
        //reverse(1234); //4321
        System.out.println("Method one: \n" +reverse(1234)+"\nMethod two :"+ method2(1234));
    }
    // log(n)
    public static int reverse(int n) {
        if(n == 0) return 0;
        int rem = n% 10;
        sum = sum*10+ rem;
        reverse(n/ 10); // get last digit for every iterative
        return sum;
    }
     static int method2(int n){
        int digits = (int) Math.log10(n) +1;
        return reverseOurNumber(n, digits);
     }

    private static int reverseOurNumber(int n, int digits) {
        if (n%10 == n) return  n;
        int remainder = n % 10;
        return remainder * (int) Math.pow(10, digits -1) + reverseOurNumber(n/10, digits -1 );
    }
}
