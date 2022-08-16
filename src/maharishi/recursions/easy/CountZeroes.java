package maharishi.recursions.easy;

public class CountZeroes {

    public static void main(String[] args) {
        System.out.println(counter(10120, 0));
    }

    private static int counter(int number, int nberOfZeroes) {
        if(number == 0) {
            return nberOfZeroes;
        }
        int rem = number % 10;
        if(rem == 0){
            return counter(number/ 10,nberOfZeroes +1);
        }
        return counter(number/ 10, nberOfZeroes);

    }
}
