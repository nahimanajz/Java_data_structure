package maharishi.oop.access;

public class ObjectDemo {
    int num;
    float gpa;
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num; // we casted it.
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
         ObjectDemo obj = new ObjectDemo(2, 1.3f);
         ObjectDemo obj1 = new ObjectDemo(2, 32.2f);
         if(obj == obj1){
             System.out.println("Obj is less than second obj");
         }
        if(obj.equals(obj1)){
            System.out.println("Obj one is equal to obj");
        }
    }
}
