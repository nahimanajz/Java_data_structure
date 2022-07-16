package maharishi.oop;

public class Person {
    String name = "Janvier";
    int regNo;
    float marks = 0.0f;

    Person(String name, int regNo, float marks){
        this.name = name;
        this.marks = marks;
        this.regNo = regNo;

    }
    // Calling constructor inside constructor
    Person(){
        // it internally means new Person("Janvier",12, 23.92)
        this("Janvier",123,23.09f);
    }
    //overloading
    Person(Person other){
    this.name = other.name;
    }
    public static void main(String[] args) {
        Person personOne = new Person();
        System.out.println(personOne.name); //output Janvier
        Person two = new Person(personOne);
        System.out.println("name:" +two.name + "Marks:"+ two.marks); // name: Janvier and marks = 0.0

        A obj = new A("Some name");
        for (int i = 0; i < 1000_000_000; i++) {
            obj = new A("New name");

        }
    }
}
class A {
    final int num =0;
    String name =  "JZ";

    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector cleanep the memory");
    }
}
