package maharishi.exercise;
// normal is number which has no odd factor except one and it self

/**
 * A normal number is defined to be one that has no odd factors, except for 1 and possibly itself. Write a method named isNormal that returns 1 if its integer argument is normal, otherwise it returns 0.
 * Examples: 1, 2, 3, 4, 5, 7, 8 are normal numbers. 6 and 9 are not normal numbers since 3 is an odd factor. 10 is not a normal number since 5 is an odd factor. The function signature is int isNormal(int n)
 */
public class isNormalNumber {
    static int isNormal(int number) {
        if (number == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                if(i %2 != 0) {
                    result = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isNormal(6));
    }
}
