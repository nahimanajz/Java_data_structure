package maharishi.bitwise_and_numbers_system;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 34567;
    int base10 = countBaseDigits(n, 10);
    int base2 = countBaseDigits(n, 2);
     System.out.println("base ten digits are:" + base10 + "binary digits are:"+ base2);
    }
    public static int countBaseDigits(int number, int base) {
        return (int)(Math.log(number) / Math.log(base)) + 1;
    }
}
