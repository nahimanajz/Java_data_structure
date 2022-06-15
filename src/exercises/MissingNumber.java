package exercises;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 1,0, 9, 7, 96, 7};
        System.out.println(getMissingNumber(arr));
    }

    private static int getMissingNumber(int[] arr) {
        int index = 0;
        while(index < arr.length) {
            int currentNumber = arr[index];
            System.out.println("<<Current Number>>"+currentNumber+"<<ARR[i]>>" +arr[index]);
            if(arr[index] < arr.length && arr[currentNumber] != arr[index]) {
                swap(arr, index, currentNumber);
            }
            index ++;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i){
                return i;
            }
        }
        return arr.length;
    }

    private static void swap(int[] numbers, int start, int currentNumber) {
        int temp = numbers[currentNumber];
        numbers[currentNumber] =  numbers[start];
        numbers[start] = temp;
    }
}
