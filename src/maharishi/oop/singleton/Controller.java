package maharishi.oop.singleton;

public class Controller {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        System.out.println(obj2);

        // All these three reference points on just one object

    }
}
