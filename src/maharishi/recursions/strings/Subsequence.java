package maharishi.recursions.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsequence {
    public static void main(String[] args) {
        subsequence("", "naja");
        System.out.println(subSequenceArray("", "naja"));
    }
    private static void subsequence(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char character = unprocessed.charAt(0);
        subsequence(processed + character, unprocessed.substring(1));
        subsequence(processed, unprocessed.substring(1));
    }
    private static ArrayList<String> subSequenceArray(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        ArrayList<String> left = subSequenceArray(processed +ch, unprocessed.substring(1));
        ArrayList<String> right = subSequenceArray(processed, unprocessed.substring(1));
        left.addAll(right);
        return left;

    }

}
