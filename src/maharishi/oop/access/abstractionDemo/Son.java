package maharishi.oop.access.abstractionDemo;

public class Son extends Parent{
    Son(int age){
        super(age);
       // this.abstractAge = age;
    }
    @Override
    void career(String name) {
        System.out.println("I am going to be SW at"+name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println(" I love "+name+"She is "+ age);
    }

    @Override
    void normalFun() {
        //super.normalFun();
        System.out.println("I am normal overriden fun");
    }
}
