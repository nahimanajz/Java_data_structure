package maharishi;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

// LeetCode 1295
public class NumbersWithEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896, 2341};
        int count = 0;
        for (int number = 0; number < nums.length; number++) {
           char[] n  = String.valueOf(nums[number]).toCharArray();
            if(n.length % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        // shortcut to find length of integer
        System.out.println(numberOfDigits(7822));
    }


     static int numberOfDigits(int number){
         return (int) Math.log10(number) + 1;
     } ;
}
