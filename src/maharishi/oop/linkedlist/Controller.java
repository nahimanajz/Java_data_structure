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
        list.insertAtLast(25);
        list.insertAtLast(90);
      list.insert(45, 1);
        System.out.println(list.deleteFirst());
        System.out.println(list.get(1));
      list.display();
        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();
        //RECURSIVE
      list.insertRec(30,3);
      list.display();



    }
}
