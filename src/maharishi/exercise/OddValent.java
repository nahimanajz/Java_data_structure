package maharishi.exercise;
// it is odd valent when it contains odd value and repeated number
public class OddValent {
    static boolean isOddValent(int[] arr){
        boolean hasOddNumber = false;
        boolean hasRepeats = false;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(current == arr[j]){
                    hasRepeats = true;
                }
            }
            if(arr[i] % 2 != 0){
                hasOddNumber = true;
            }

        }
        return hasOddNumber & hasRepeats ;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5};
        System.out.println(isOddValent(arr));
    }
}
