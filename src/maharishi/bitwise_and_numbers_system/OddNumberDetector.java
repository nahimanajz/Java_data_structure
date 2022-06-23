package maharishi.bitwise_and_numbers_system;

public class OddNumberDetector {
    public static void main(String[] args) {
        System.out.println(isOdd( 8));
    }

    private static boolean isOdd(int number) {
        return (number & 1) == 1;
    }
}
