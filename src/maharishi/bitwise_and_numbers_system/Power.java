package maharishi.bitwise_and_numbers_system;

public class Power {
    public static void main(String[] args) {
        // Time complexity = log(base)
        int base = 2;
        int power = 4;
        int ans = 1;
        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            base *=base;
            power = power >> 1;
        }
        System.out.println(ans);
    }
}
