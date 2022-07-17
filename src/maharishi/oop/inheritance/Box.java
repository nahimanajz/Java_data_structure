package maharishi.oop.inheritance;

public class Box {
    double h, l, w;
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    // cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(double l, double w, double h){
        this.l = h;
        this.h = l;
        this.w = w;
    }
    Box(Box box){
        this.l = box.h;
        this.h = box.l;
        this.w = box.w;
    }
    public void  information(){
        System.out.println("Running the box");
    }
}

