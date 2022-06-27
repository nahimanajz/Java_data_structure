package maharishi.maths;
https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm
public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(9, 10));
        System.out.println(lcm(2, 7));
    }

    private static int lcm(int a, int b) { // Least common divider
        return a * b / gcd(a, b);
    }

    private static int gcd(int a, int b) { // greatest common divider
        if(a == 0) {
            return b;
        }
        return  gcd(b%a, a);

    }

}
