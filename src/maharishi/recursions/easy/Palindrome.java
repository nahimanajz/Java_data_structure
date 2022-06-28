package maharishi.recursions.easy;

public class Palindrome {
    static int reverse(int n){
        int digits = (int) Math.log10(n) +1;
        return helper(n, digits);
    }
     static int helper(int n, int digits) {
        if (n%10 == n) return  n;
        int remainder = n % 10;
        return remainder * (int) Math.pow(10, digits -1) + helper(n/10, digits -1 );
    }
    private static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
     public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }

}