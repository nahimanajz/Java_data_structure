package maharishi.oop.exceptionsHandling;


public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
           // divide(a, b);
            //Mimicking
            String name = "Janvier";
            if(name.equals("Janvier")){
                throw new MyException("Janvier is here sir");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("IT will always execute");
        }
    }
    static int divide(int a, int b) throws ArithmeticException { // Throws keyword is used to declare an exception
        if(b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
