package maharishi.bitwise_and_numbers_system;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 32; // note: note fixed for n = 0;
        System.out.println(isPowerOfTwo(n));
        // int shifting numbers
        int leftShift = 7;
        System.out.println(leftShift >> 1);
    }
    public static boolean isPowerOfTwo(int n) {
        return (n & (n- 1)) == 0;
    }
}
