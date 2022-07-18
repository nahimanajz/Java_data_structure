package maharishi.oop.enumExample;

public class Basic {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants above here
        // public static and final
        // since it's final you can not create child enums

        // Enum constructor below here

        Week(){
            System.out.println("Constructor:" + this);
        }
        @Override
        public void hello() {
            System.out.println("Enum greeting from interface");
        }
        // every method must have body within enum
        void show(){
            // some awesome contents goes here
        }
    }

    public static void main(String[] args) {
        Week week;

        System.out.println(Week.Monday);
        for(Week day: Week.values()) {
            System.out.println(day);
        }
        System.out.println(Week.valueOf("Monday"));
    }
}
