package maharishi.oop.singleton;

public class Singleton {
    public static Singleton instance = null;
    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
