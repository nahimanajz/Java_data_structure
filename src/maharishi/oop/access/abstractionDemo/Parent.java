package maharishi.oop.access.abstractionDemo;
// every child class that extends this class has to override all methods
// you can never create object of abstract class\
// Since abstract method needs to be overridden and static method never be overridden then you can no t create abstract stacit method
// But you can create static method in abstract class
public abstract  class Parent {
    Parent(int age){
        this.abstractAge = age;
    }
    int abstractAge;
    abstract void career(String name);
    abstract  void partner(String name, int age);
  void normalFun(){
      System.out.println("I am normal function and I can be overridden");
  }
  static void staticFun(){
      System.out.println("Static functions are used in Abstract classes");
  }
}
