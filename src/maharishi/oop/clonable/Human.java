package maharishi.oop.clonable;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr = {1,2,4,5,6,7};
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // shallow copy
      //  return super.clone();
        // deep copy
        Human twin = (Human)super.clone(); // shallow copy
        //make a deep copy
        twin.arr = new int[twin.arr.length];

        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
