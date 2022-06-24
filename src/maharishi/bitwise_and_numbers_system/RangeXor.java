package maharishi.bitwise_and_numbers_system;

public class RangeXor {
    public static void main(String[] args) {
        int a = 3;
        int b =9;
        int ans = xor(b)  ^ xor(a -1);
        System.out.println(ans);
        xorMethod2(a, b);
    }

    private static void xorMethod2(int a, int b) {
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }

    private static int xor(int a) {
        int divident = a % 4;
        switch (divident){
            case 0:
                return a;
            case 1:
                return 1;
            case 2:
                return a + 1;
            default:
                return 0;
        }
    }
}
