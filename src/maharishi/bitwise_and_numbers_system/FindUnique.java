package maharishi.bitwise_and_numbers_system;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        int answ = 0;
        for(int n: arr) {
            answ ^= n;
        }
        System.out.println(answ);
    }
}
