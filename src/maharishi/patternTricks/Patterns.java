package maharishi.patternTricks;

public class Patterns {

    /**
     * steps:
     * outer loop runs times equal counted rows
     * identify number of columns which are on every row
     * identify what to print
     * when new a line is printed then insert new line
     * Try to find formula relating rows and columns
     */
    public static void main(String[] args) {
        //patternTwo(5);
        //patternOne(4);
        //patternThree(5);
        patternThreeSecondMethod(5);
    }
    public static void patternOne(int number){
        for (int row = 1; row <= number; row++) {
            //print n stars for every column
            for (int col = 1; col <= number ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternTwo(int numRows){
        for (int row = 1; row <= numRows; row++) {
            // for every row is printed, we need to add a newline
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // When one row is printed, we need to add  new line
            System.out.println();

        }
    }
    public static void patternThree(int number) {
        for (int row = 0; row <number ; row++) {
            for (int col = number; col > row ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patternThreeSecondMethod(int number) {
        for (int row = 1; row <=number ; row++) {
            for (int col = 1; col <= number - row +1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    }
