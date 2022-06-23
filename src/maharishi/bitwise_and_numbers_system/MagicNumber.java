package maharishi.bitwise_and_numbers_system;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 60;
        int answ = 0;
        int base = 5;
        System.out.println(n&1);
        while (n > 0){
            int lastDigit = n & 1;
            n = n >> 1; // Shifting from first number to the right number in binary of given input (N)
           answ += lastDigit * base;
            base = base * 5;
        }
        System.out.println(answ);
    }
}
