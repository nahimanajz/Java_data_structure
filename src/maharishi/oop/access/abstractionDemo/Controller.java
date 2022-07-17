package maharishi.oop.access.abstractionDemo;

public class Controller {
    public static void main(String[] args) {
        Son son = new Son(32);
        son.career("  Meta");
        System.out.println(son.abstractAge);
        Parent.staticFun();
        son.normalFun();
    }
}
