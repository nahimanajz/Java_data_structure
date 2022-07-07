package maharishi.recursions.strings;
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        pad("12", "");
        System.out.println(padInList("12", ""));
    }

     static void pad(String number, String letterCombination) {
        if(number.isEmpty()){
            System.out.println(letterCombination);
            return;
        }
        int digit = number.charAt(0) - '0'; // convert character to number

        for (int i = (digit - 1) * 3; i < digit * 3; i++) { // since phone pad has three characters then multiply by three
            char alphabet = (char) ('a' + i); // get alphabetical character
            pad(number.substring(1), letterCombination + alphabet);

        }
    }
    static List<String> padInList(String number, String letterCombination) {
        if(number.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(letterCombination);
            return  list;

        }
        int digit = number.charAt(0) - '0'; // convert character to number
        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) { // since phone pad has three characters then multiply by three
            char alphabet = (char) ('a' + i); // get alphabetical character
            list.addAll(padInList(number.substring(1), letterCombination + alphabet));
        }
        return  list;
    }

}
