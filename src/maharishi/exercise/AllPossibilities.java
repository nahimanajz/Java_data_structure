package maharishi.exercise;

import java.util.Arrays;

/**
 * A non-empty array of length n is called an array of all possibilities, if it contains all numbers between 0 and n - 1 inclusive. Write a method named isAllPossibilities that accepts an integer array and returns 1 if the array is an array of all possibilities, otherwise it returns 0.
 * Examples {1, 2, 0, 3} is an array of all possibilities, {3, 2, 1, 0} is an array of all possibilities, {1, 2, 4, 3} is not an array of all possibilities, (because 0 not included and 4 is too big), {0, 2, 3} is not an array of all possibilities, (because 1 is not included), {0} is an array of all possibilities, {} is not an array of all possibilities
 * (because array is empty).
 * If you are programming in Java or C#, the function signature is
 * int isAllPossibilities(int[ ] a)
 * If you are programming in C or C++, the function signature is int
 * isAllPossibilities(int a[ ], int len) where len is the number of elements in the array.
 */
public class AllPossibilities {
   static int isAllPossibilities(int[] arr, int len){
       Arrays.sort(arr);
       int result = 1;
       for (int i = 0; i < len; i++) {
           if(arr[i] != i || arr[i] > len){
               result = 0;
           }

       }
       return result;
   }
    public static void main(String[] args) {
       int[] test1 = {1, 2, 4, 3};
       int[] test2 = {3, 2, 1, 0};
       int[] test3 =  {1, 2, 0, 3};

       System.out.println(isAllPossibilities(test1, test1.length));
       System.out.println(isAllPossibilities(test2, test2.length));
       System.out.println(isAllPossibilities(test3, test3.length));
    }
}
