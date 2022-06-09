package maharishi;
import java.math.*;
public class Ration {
    class Ratio {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */
        private static BigDecimal toDecimal(double  number) {
            return new BigDecimal(number).setScale(6, BigDecimal.ROUND_FLOOR);
        }
        public static void plusMinus(int[] arr) {
            // Write your code here
           // int[] arr = Arrays.stream(data).asDoubleStream().toArray(); //arr.toArray(arr);
            int size = arr.length;
            double negative = 0.0, positive = 0.0, zero = 0.0;
            BigDecimal negRatio, posRatio, zeroRatio;
            for(int i = 0; i <= arr.length - 1; i++) {
                if(arr[i] < 0) {
                    negative++;
                } else if(arr[i] > 0){
                    positive++;
                }else if(arr[i] == 0) {
                    zero++;
                }
            }

            negRatio = Ratio.toDecimal(negative/size);
            posRatio = Ratio.toDecimal(positive/size);
            zeroRatio = Ratio.toDecimal(zero/size);

            System.out.println(negRatio);
            System.out.println(posRatio);
            System.out.println(zeroRatio);

        }

    }
    public static void main(String[] args) {
        int[] numbers = {1, 1, 0, -1, -1};
        Ratio.plusMinus(numbers);
    }
}
