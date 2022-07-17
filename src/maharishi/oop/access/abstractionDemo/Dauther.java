package maharishi.oop.access.abstractionDemo;
public class Dauther extends Parent {

    Dauther(int age) {
        super(age);
    }

    @Override
    void normalFun() {
       super.normalFun();
    }

    @Override
    void career(String name) {
        System.out.println("I am going to be SW at"+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println(" I love "+name+"he is "+ age);
    }
}
