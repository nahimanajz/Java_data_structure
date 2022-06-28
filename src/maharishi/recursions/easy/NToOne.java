package maharishi.recursions.easy;

public class NToOne {
    public static void main(String[] args) {
        decrementor(5);
    }

    private static void decrementor(int number) {
        if( number == 0){
            return;
        }
        System.out.println(number);
        decrementor(number-1);
    }

}
