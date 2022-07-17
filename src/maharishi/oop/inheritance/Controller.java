package maharishi.oop.inheritance;

public class Controller {
    public static void main(String[] args) {
        Box one = new Box(3.0, 4.3,2.3);
        Box two = new Box(one); // here object depends on another thereby both object has the same values
        System.out.println(two.h);

        BoxWeight three = new BoxWeight();
        BoxWeight four = new BoxWeight(2, 3, 4,8);
        System.out.println(three.h + " " + three.weight);

        Box five = new BoxWeight(2,3,4,5); // referencing parent to chi
        System.out.println(five.w); //output -1.0

       // BoxWeight six = new Box(2, 3,4); // referencing child to parent is no possible
        //System.out.println(six);

    }

}
