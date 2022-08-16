package maharishi.codility;

import java.util.Arrays;

public class PermMissingElem {
    public  static int missing(int[]arr){
        int missing = 1; // -1 means no missing number
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i =0;
        while(i < arr.length){
            if(arr[i] != missing){
                 return missing;
            }
            missing++;
            i++;

       }
        return missing;
    }

    public static void main(String[] args) {
        int[] A= {2, 3, 1, 5};
       // int miss= PermMissingElem.missing(A);
        System.out.println(missing(A));
    }
}
