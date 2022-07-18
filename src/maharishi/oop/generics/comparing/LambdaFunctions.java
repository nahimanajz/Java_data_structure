package maharishi.oop.generics.comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7};
        ArrayList<Integer> numbers = new ArrayList();
        for (int i = 0; i < 5; i++) {
           numbers.add(i +1);
        }
        // numbers.forEach((item) -> System.out.println(item*2));
        Consumer<Integer> fun = (item)->System.out.println(item*2);
        numbers.forEach(fun);

        /**
         * Calling interface and perform calculation
         */
        Operation add = (a, b)-> a+b;
        Operation multiply = (a, b)-> a * b;
        Operation sub = (a, b)-> a - b;

        /**
         * make an object
         */
        LambdaFunctions calc = new LambdaFunctions();
        System.out.println(calc.operate(5, 3, add));
        System.out.println(calc.operate(5, 3, multiply));
        System.out.println(calc.operate(5, 3, sub));

    }
    int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}
interface  Operation {
    int operation(int a, int b);
}