package maharishi.oop.inheritance;

public class BoxWeight extends  Box{
  double weight;
  public BoxWeight(){
      this.weight = -1;
  }
  public BoxWeight(double l, double h, double w, double weight){
      super(l, w, h); // calling constructor method
      // used to initialize values in parent class
      this.weight = weight;

  }
}
