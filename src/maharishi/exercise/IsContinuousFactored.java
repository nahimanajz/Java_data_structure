package maharishi.exercise;

/**
 * An integer is defined to be “continuous factored” if it can be expressed as the product of two or more continuous integers greater than 1.
 * Examples of “continuous factored” integers are: 6 = 2 * 3.
 * 60 = 3 * 4 * 5
 * 120 = 4 * 5 * 6
 * 90 = 9*10
 * Examples of integers that are NOT “continuous factored” are: 99 = 9*11, 121=11*11, 2=2, 13=13
 * Write a function named isContinuousFactored(int n) that returns 1 if n is
 * continuous factored and 0 otherwise.
 */
public class IsContinuousFactored {
    static int isContinuousFactored(int[] arr, int target){
        int result =0, product = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length ; j++) {
                product = arr[i] * arr[j];
                if (product == target) {
                    return 1;
                }
                else {
                    for (int n:arr) {
                        product *=n;
                        if(product == target){
                            return 1;
                        }
                    }
                }
            }


        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,3,4};
        int target = 24;
        System.out.println(isContinuousFactored(arr, target));
    }
}
