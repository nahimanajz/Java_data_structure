package maharishi.oop.polymorphism;

public class ObjectPrint {
    int num;
    ObjectPrint(int num){
        this.num = num;
    }
    @Override
    public String toString() {
        return "ObjectPrint{" +"Num="+ num+ '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(4);
        System.out.println(obj);
    }
}
