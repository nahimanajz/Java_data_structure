package maharishi.recursions;

public class RemoveLetter {
    public static void main(String[] args) {
        remove("abagabo", "", 'g');
        System.out.println(removeApple(" apple fruit apple"));
    }

    private static void remove(String text, String newText, char target) {
        if (text.isEmpty()) {
            System.out.println(newText);
            return;
        }
        char character = text.charAt(0);
        if (character == target) {
            remove(text.substring(1), newText, target);
        } else {
            remove(text.substring(1), newText + character, target);
        }
    }
    static  String removeApple(String text){
        if(text.isEmpty()){
            return "";
        }
        if(text.startsWith("apple")){
            return removeApple(text.substring(5));
        } else {
            return text.charAt(0) + removeApple(text.substring(1));
        }
    }
}
