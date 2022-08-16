package maharishi.post;

public class IsHappy {
    public boolean isHappy(int n) {
        int oneStep = n, twoStep = n ;
        do {
            oneStep = findSquare(n);
            twoStep = findSquare(findSquare(n));
        } while(oneStep != twoStep);
       return oneStep == 1;
    }
    private int findSquare(int n){
        int sum = 0;
        while(n !=0) {
            int rem = n % 10;
            n /=10;
            sum += rem * rem;
        }
        return sum;
    }

    public static void main(String[] args) {
        IsHappy isHappy = new IsHappy();
        System.out.println(isHappy.isHappy(12));
        System.out.println(isHappy.isHappy(12));
    }
}
