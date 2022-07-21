package maharishi.oop.linkedlist;

public class Controller {
    public static void main(String[] args) {
        LL list = new LL();
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(6);
//        list.insertFirst(7);
      list.insertFirst(35);
      list.insertAtLast( 17);
      list.insertAtLast(15);
      list.insert(45, 1);
        System.out.println(list.deleteFirst());
        System.out.println(list.get(1));
      list.display();
    }
}
