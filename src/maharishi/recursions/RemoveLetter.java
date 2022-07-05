package maharishi.recursions;

public class RemoveLetter {
    public static void main(String[] args) {
        remove("abagabo", "", 'g');
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
}
