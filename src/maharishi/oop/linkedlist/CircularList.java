package maharishi.oop.linkedlist;

public class CircularList {
    private Node head;
    private Node tail;

    public CircularList() {
        this.head = null;
        this.tail = null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        node.next = head;

    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        //deleting head
        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }

        //deleting specific node
        do{
            Node postNode = node.next; // node next to the one we want to delete
            if(postNode.val == val){
                node.next = postNode.next;
                break;
            }
            node = node.next;
        } while(node != head);
    }
    public void display(){
        Node node  = head;
        if(head != null){
            do {
                System.out.print(node.val + "->");
                node = node.next; // to step ahead
            }while( node != head);
        }
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
