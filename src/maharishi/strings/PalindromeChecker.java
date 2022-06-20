package maharishi.strings;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "papa";
       boolean check =  check(str);
        System.out.println(check);
    }

    /**
     *  String is palindrome it is spelled likely forward and backward
     *  ex: asa
     * */
    private static boolean check(String str) {
        for (int i = 0; i < str.length(); i++) {
            char startChar = str.charAt(i);
            char endChar = str.charAt(str.length() -1 - i);
            if (startChar != endChar) {
                return false;
            }

        }
        return true;
    }

}
