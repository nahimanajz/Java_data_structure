package maharishi.recursions.strings;
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

public class PhonePad {
    public static void main(String[] args) {
        pad("12", "");
    }

     static void pad(String number, String letterCombination) {
        if(number.isEmpty()){
            System.out.println(letterCombination);
            return;
        }
        int digit = number.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char alphabet = (char) ('a' + i); // get alphabetical character
            pad(number.substring(1), letterCombination + alphabet);

        }
    }

}
