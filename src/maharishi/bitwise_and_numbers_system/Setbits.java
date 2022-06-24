package maharishi.bitwise_and_numbers_system;

public class Setbits {
    public static void main(String[] args) {
        int num  = 45;
        String toBinary = (Integer.toBinaryString(num));
        System.out.println(toBinary);
        System.out.println(setBits(num));
    }
    public static int setBits(int n){;
        int count = 0;
        while(n > 0){
            count++;
            n = n & (n-1); // n -= (n & -n);
        }
        return count;
    }
    public static int setBits1(String num){
        int n = Integer.valueOf(num);
        int count = 0;
        while(n > 0){
            count++;

        }
        return count;

    }
}
