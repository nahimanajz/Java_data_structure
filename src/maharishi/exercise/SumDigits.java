package maharishi.exercise;

public class SumDigits {
    static int isDigitSum(int n, int total){

        int sum =0;
       while (n!=0){
           sum += n% 10;
           n = n/10;
       }
       return sum;
    }

    public static void main(String[] args) {
        System.out.println(isDigitSum(1118, 3));
    }
}
