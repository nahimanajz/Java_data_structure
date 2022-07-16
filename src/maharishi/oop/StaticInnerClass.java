package maharishi.oop;

public class StaticInnerClass {
    /**
     * if child class was static, then parent class main method could not find object to print inner class properties
     */
    static  class Child {
        String name;
     public Child(String name){
         this.name = name;
     }

    }

    public static void main(String[] args) {
        Child first = new Child("Janvier");
        Child second = new Child("Nahi");
        System.out.println(first.name);
        System.out.println(second.name);

    }
}

