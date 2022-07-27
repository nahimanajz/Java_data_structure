package maharishi.oop.linkedlist;

public class DoublyController {
    public static void main(String[] args) {
        DoublyLinkedList dd = new DoublyLinkedList();
        dd.insertFirst(23);
        dd.insertFirst(31);
        dd.insertFirst(12);
        dd.insertFirst(21);
        dd.insertFirst(11);
        // insert last
        dd.insertLast(90);
        dd.display();
        //insert after
        dd.insert(12, 37);
        dd.display();

    }
}
