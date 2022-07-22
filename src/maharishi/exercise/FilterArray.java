package maharishi.exercise;

/**
 * An array is defined to be a Filter array if it meets the following conditions a. If it contains 9 then it also contains 11.
 * b. If it contains 7 then it does not contain 13.
 * So {1, 2, 3, 9, 6, 11} and {3, 4, 6, 7, 14, 16}, {1, 2, 3, 4, 10, 11, 13} and {3, 6, 5, 5, 13, 6, 13} are Filter arrays. The following arrays are not Filter arrays: {9, 6, 18} (contains 9 but no 11), {4, 7, 13} (contains both 7 and 13)
 * Write a function named isFilter that returns 1 if its array argument is a Filter array, otherwise it returns 0.
 * If you are programming in Java or C#, the function signature is
 * int isFilter(int[ ] a)
 * If you are programming in C or C++, the function signature is int isFilter(int a[ ], int len) where len is the number of elements in the array.
 */
public class FilterArray {

    static int getElement(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return 1;
            }
        }
      return 0;
    }

    static int isFilter(int[] arr){
        int isFilter = 0;
        for (int i = 0; i < arr.length; i++) {
            // check for 9 and 11
            if(arr[i] == 9 && getElement(arr, 11) == 1){
                isFilter = 1;
            }
            // check for 7 and forbidden 13
            if (arr[i] == 7 && getElement(arr, 13) == 0) {
                isFilter = 1;
            }

        }
        return isFilter;

    }

    public static void main(String[] args) {
        int[] filterOne = {1, 2, 3, 9, 6, 11} ;
        int[] filterTwo = {3, 4, 6, 7, 14, 16};
        int[] filterThree = {1, 2, 3, 4, 10, 11, 13};
        int[] notFilter = {4, 7, 13};
        int[] notFilterTwo = {9, 6, 18};
        System.out.println(isFilter(filterOne));
        System.out.println(isFilter(filterTwo));

        System.out.println(isFilter(notFilterTwo));
        System.out.println(isFilter(notFilter));

    }
}
