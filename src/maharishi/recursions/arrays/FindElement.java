package maharishi.recursions.arrays;

import java.util.ArrayList;

//Binary search
public class FindElement {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,6,5, 6};
        int target = 6;
        System.out.println(getElement(arr, 0, target));
        System.out.println(findIndex(arr, 0, target));
        System.out.println(findLastIndex(arr, arr.length -1,  target)); //last index
        ArrayList<Integer> list = new ArrayList<>();
      ArrayList<Integer> answ = findAllIndexes(arr, target, 0, list);
        System.out.println(answ);

    }

    private static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index, ArrayList<Integer> list) {
     if(index == arr.length) {
         return list;
     }
     if(target == arr[index]){
         list.add(index);
     }
      return findAllIndexes(arr,target,index+1, list);
    }

    private static boolean getElement(int[] arr, int index, int target) {
        if(index == arr.length -1){
            return false;
        }
        return target == arr[index] ||  getElement(arr, index+1, target);
    }
    private static int findIndex(int[] arr, int index, int target) {
        if(index == arr.length -1){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        return findIndex(arr, index + 1, target);
    }
    private static int findLastIndex(int[] arr, int index, int target) {
        if(index ==  -1){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        return findIndex(arr, index -1, target);
    }

}
