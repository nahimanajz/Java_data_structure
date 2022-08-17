package maharishi.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dictinct {
    public static int[] sort(int[] arr){
        //bubble sort
        for (int i = 0; i <=arr.length; i++) {
            for (int j = 1; j <arr.length -i ; j++) {
                int current = arr[j];
                int previous = arr[j-1];
                if (previous > current) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }
    public static int distinct(int[] arr) {
        int distinct = 1;
        for (int i = 1; i < arr.length; i++) {

             if(  arr[i-1] != arr[i]){
                 distinct++;
             }

        }
        return distinct;
    }

        private static void swap(int[] arr, int startIndex, int endIndex) {
        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
    }
    /** using hashset */
    public static int usingHashSet(int[] A) {
        // write your code in Java SE 8
        if(A.length < 1) return 0;
        Set<Integer> number = new HashSet<Integer>();
        int count =0;
        for(int a=0; a< A.length; a++){
            if(!number.add(A[a])){
                count++;
            }
        }
        return count;
    }

    /**
     *
     * @param args
     */
    public static int usinglOOP(int[] a){
        int i, j, count = 1;
        int n = a.length;
        //Traverse the array
        for (i = 1; i < n; i++)      //hold an array element
        {
            for (j = 0; j < i; j++)
            {
                if (a[i] == a[j])    //Check for duplicate elements
                {
                    break;             //If duplicate elements found then break
                }
            }
            if (i == j)
            {
                count++;     //increment the number of distinct elements
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,3,1,1,6};
       int[] sorted = Dictinct.sort(arr);
       System.out.println(Dictinct.distinct(sorted));
        int num = Dictinct.usingHashSet(arr);

        System.out.println(Arrays.toString(sorted));
        System.out.println(num);

    }

}
