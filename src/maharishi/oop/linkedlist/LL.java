package maharishi.oop.linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size +=1;
    }
    public void insertAtLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
       Node node = new Node(val);
       tail.next = node;
       tail = node;
       size++;
    }
    public void insert(int value, int index){
        if(index == size){
            insertAtLast(value);
            return;
        }
        if(index == 0){
            insertFirst(value);
            return;
        }
        Node current = head;
        // Traverse list up to position - 1
        for (int i = 1; i < index; i++) {
            current = current.next;  // Point NEXT pointer to the new node
        }

        Node node = new Node(value, current.next);
        // Point NEXT pointer of current node to the new node
        current.next = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        System.out.println(temp.next);
        while(temp != null){
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.println("End");
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

