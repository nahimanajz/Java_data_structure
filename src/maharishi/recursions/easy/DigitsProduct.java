package maharishi.recursions.easy;

public class DigitsProduct {
    public static void main(String[] args) {
        System.out.println(product(223));
    }

    private static int product(int i) {
        if(i%10 == i) return i;
        return i%10 * product(i/10);
    }
}
