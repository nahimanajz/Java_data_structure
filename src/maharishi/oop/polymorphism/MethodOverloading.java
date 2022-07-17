package maharishi.oop.polymorphism;

public class MethodOverloading {
    /*
        Calculate sum
     */
    int sum(int a, int b){
        return a+b ;
    }
    void sum(){
        System.out.println(8+9);
    }
    double sum(double a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading sumOne = new MethodOverloading();
        sumOne.sum();
        sumOne.sum(2,4);
        sumOne.sum(3.9, 4);
    }
}
