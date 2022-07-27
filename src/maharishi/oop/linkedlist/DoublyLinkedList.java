package maharishi.oop.linkedlist;



public class DoublyLinkedList {
    Node head;

    public void insertFirst(int val){
       Node node = new Node(val);
       node.next = head;
       node.prev = null;
       if(head != null){
            head.prev = node;
       }
       head = node;
    }
    public void display(){
        Node node = head;
        Node last = null; // to reverse
        while (node !=null){
            System.out.print(node.val+ "->");
            last = node;
            node = node.next;
        }
        System.out.println("End ");
        // print reversed linked list
        while(last != null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("End");
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void   insert(int after, int value){
        Node previousNode = find(after);
        if(previousNode == null){
            System.out.println("Does not exit");
        }
        Node node = new Node(value);
        node.next = previousNode.next;
        previousNode.next = node;
        node.prev = previousNode;
        node.next.prev = node; // previous node of next node



    }
    private class  Node{
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
        public Node(int val) {
            this.val = val;
        }
    }
}
