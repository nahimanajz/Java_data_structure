package maharishi.maths;

public class Factors {
    public static void main(String[] args) {
       // solutionOne(20);   //0(n)
        System.out.println();
        solutionTwo(20);   //0(Math.sqrt(n))
    }

    private static void solutionTwo(int number) {
        for (int j = 1; j < Math.sqrt(number); j++) {
            if (number % j == 0){
                if (number / j == j){ // ignore duplicates
                    System.out.print(j+" ");
                }
                System.out.print(j +"X"+ number / j +" ");
            }

        }
    }

    private static void solutionOne(int number) {
        for (int i = 1; i < number; i++) {
            if (number%i == 0) {
                System.out.print(i+ " ");
            }
            
        }
        
    }
}
