package maharishi.oop;

public class StaticBlock {
    static int a = 5;
    static  int b;
    static  {
        System.out.println("I am static block");
        b = 5 * a;
    }
    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
