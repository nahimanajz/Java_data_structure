package maharishi.oop.linkedlist;


public class MergeTwoList {
    public static  LL mergeLists(LL first, LL second){
        Node head1 = first.head;
        Node head2 = second.head;

    }
    public static void main(String[] args) {
        // let's benefit from inserting element sing remove duplicates class
        RemoveDuplicates list = new RemoveDuplicates();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(4);

        RemoveDuplicates list2 = new RemoveDuplicates();

        list2.insertFirst(1);
        list2.insertFirst(3);
        list2.insertFirst(4);

    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

}
