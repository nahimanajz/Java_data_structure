package maharishi.recursions.easy;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(1342));
    }

    private static int sum(int i) {
        if(i == 0){
            return 0;
        }
        int remainder = i % 10;
        int  rds= sum(i/10);//remainingDigitsSum
        return remainder + rds;
    }
}
