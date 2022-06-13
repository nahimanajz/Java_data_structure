package maharishi;

import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = new int[] {12, 3, 4,5 ,7};
        int startIndex =0, endIndex = numbers.length -1;
        while(startIndex < endIndex) {
            reverse(numbers, startIndex, endIndex);
            startIndex ++;
            endIndex --;
        }
        System.out.println(Arrays.toString(numbers));
    }
    public static void reverse(int[] numbers, int start, int end){
        int temp = numbers[start];
        numbers[start] =  numbers[end];
        numbers[end] = temp;
    }
}
