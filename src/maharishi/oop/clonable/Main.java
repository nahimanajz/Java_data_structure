package maharishi.oop.clonable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human janvier = new Human(34, "Janvier");

        Human twin = (Human) janvier.clone();
         twin.arr[0] = 200; // these changes reflects to original object
        System.out.println(twin.age+" "+ twin.name);

        System.out.println(Arrays.toString(janvier.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
