package maharishi.oop.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Controller {
    public static void main(String[] args) {
        Student janvier = new Student(12, 89.9f);
        Student rahul = new Student(2, 99.2f);
        Student runaka = new Student(5, 95.2f);
        Student karan = new Student(13, 99.2f);
        Student arpit = new Student(12, 77.2f);
        Student krishnah = new Student(9, 96.2f);

        Student[] list = {janvier,rahul, runaka, karan, arpit, krishnah };
        Arrays.sort(list, (o1, o2) -> -(int) (o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

//        if(janvier.compareTo(rahul) < 0){
//            System.out.println("Janvier has less marks");
//        }

    }
}
