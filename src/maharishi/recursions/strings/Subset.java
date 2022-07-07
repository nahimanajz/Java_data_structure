package maharishi.recursions.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ex:Input=>  arr = {1, 2,3} output = [[],[1], [2], [1, 2], [3],[1, 3], [2, 3], [1, 2, 3]]
public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>>  ans = subset(arr);
        for (List<Integer> element : ans) {
            System.out.println(element);
        }
        //Duplicated
        for (List<Integer> elem: subsetWithDuplicates(arr)) {
            System.out.print(elem +" ");
        }
    }

     static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
    /**
     * sort
     * @return List<List<Integer>
     */
    static List<List<Integer>> subsetWithDuplicates(int[] arr){
    Arrays.sort(arr);
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());
    int start = 0;
    int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            //increment when current == previous element
            if(i > 0 && arr[i] == arr[i-1]) {
                start = end +1;
            }
            end = outer.size() -1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);

            }

        }
        return  outer;

    }
}
