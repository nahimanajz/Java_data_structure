package maharishi.exercise;

public class NumberOfOne {
    static int countOnes(int n, int ones){
        if(n == 0){
            return ones;
        }
        int rem = n % 2;
        if(rem == 1){
            ones++;
        }
        return countOnes(n/2, ones);
    }
    public static void main(String[] args) {
        System.out.println(countOnes(143, 0));
    }
}
