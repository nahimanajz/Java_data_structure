package maharishi.recursions.strings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        //permutations("", "abc");
        ArrayList<String> pl = permutationList("", "abc");
        System.out.println(pl);
        System.out.println(countPermutation("", "abc"));
    }

    static void permutations(String newText, String text) {
        if(text.isEmpty()){
            System.out.println(newText);
            return;
        }
        char character = text.charAt(0);

        for (int i = 0; i <= newText.length(); i++) {
            String first = newText.substring(0, i);
            String second = newText.substring(i, newText.length());

            permutations(first + character + second, text.substring(1));
        }
    }
    static ArrayList<String> permutationList(String newText, String text) {
        if(text.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
             list.add(newText);
            return list;
        }
        char ch = text.charAt(0);
        ArrayList<String> element = new ArrayList<>();

        for (int i = 0; i <= newText.length() ; i++) {
            String first = newText.substring(0, i);
            String second = newText.substring(i, newText.length());
            element.addAll(permutationList(first + ch + second, text.substring(1)));
        }
        return element;
    }

    static int countPermutation(String newText, String text) {
        if (text.isEmpty()) {
            return 1;
        }
        char character = text.charAt(0);
        int count = 0;
        for (int i = 0; i <= newText.length(); i++) {
            String first = newText.substring(0, i);
            String second = newText.substring(i, newText.length());

            count = count + countPermutation(first + character + second, text.substring(1));
        }
        return count;
    }
}
