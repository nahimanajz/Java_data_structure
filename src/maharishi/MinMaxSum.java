package maharishi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one
public class MinMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
 /* 1. sort
    2. remove last element and sum remaining items

    3. remove fist element and sum last element
    4. append two sums into one array
 */

        int[] numbers = arr.stream().mapToInt(i->i).toArray();
        // sort
        for(int n =1; n < numbers.length; n++) {
            for(int m = n+1; m< numbers.length; m++ ){
                if(numbers[n] > numbers[m]) {
                    int min = numbers[m];
                    numbers[m] = numbers[n];
                    numbers[n] = min ;
                }
            }
        }

        // calculate sum one, skip last number
        int sumOne = 0;
        for(int i=0; i < numbers.length -1; i++) {
            sumOne += numbers[i];
        }
        int sumTwo = 0;
        // calculate sum two, skip the first item from our array
        for (int i = 1; i < numbers.length; i++) {
            sumTwo +=numbers[i];
        }
        System.out.println(sumOne +" "+sumTwo);
        System.out.println(Arrays.toString(numbers));
        //int[] sorted = Arrays.s;

     }    public static void main(String[] args) {

        MinMaxSum.miniMaxSum(Arrays.asList(1,3, 9, 7, 5));
    }
}
