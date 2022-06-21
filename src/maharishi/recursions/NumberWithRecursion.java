package maharishi.recursions;

public class NumberWithRecursion {
    public static void main(String[] args) {
        // print numbers from 1 to 5
        print(1);
    }

    private static void print(int n) {
        if( n == 5) {  // base condition to stop function call
            System.out.println(n);
            return;
        }
        System.out.println(n); // function body
        print(n+1); // function recursion

    }

}
