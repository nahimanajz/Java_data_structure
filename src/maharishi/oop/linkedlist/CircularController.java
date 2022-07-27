package maharishi.oop.linkedlist;

public class CircularController {
    public static void main(String[] args) {
        CircularList cll = new CircularList();
        cll.insert(23);
        cll.insert(3);
        cll.insert(19);
        cll.insert(75);

        cll.delete(19);
        cll.display();

    }
}
