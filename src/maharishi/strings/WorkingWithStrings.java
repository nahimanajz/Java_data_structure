package maharishi.strings;

public class WorkingWithStrings {
    public static void main(String[] args) {
        workingWithFloats();
    }
/**
 * Rounding floats
 * */
    private static void workingWithFloats() {
        float a = 53.1274f;
        System.out.printf("Formatted number is %.02f", a);
        System.out.println();
        System.out.printf("PIE: %.3f", Math.PI);
        System.out.printf("Hello my name is %s and I am %s", "Janvier",  "NA"); // %s means placeholder
    }

}
