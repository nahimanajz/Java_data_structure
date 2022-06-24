package maharishi.maths;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
    static boolean isPrime(int n){
        if(n <=1) {
            return false;
        }
        int numberSquare =2;
        while(numberSquare * numberSquare <= n) {
            if(n % numberSquare ==0) {
                return false;
            }
            numberSquare++;
        }
       return true;
    }
}
