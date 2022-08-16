package maharishi.oop.linkedlist;

public class LL {
    public Node head;
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
    public void insertRec(int val,int index){
        head = insertRecur(val, index, head);
    }
    public Node insertRecur(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
           // System.out.println(temp.next);
            return temp;
        }
        node.next = insertRecur(val, index-1, node.next);
        return node;
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
    public int deleteLast(){
       if(size <= 1){
           return deleteFirst();
       }
       Node secondLast = get(size -2);
       int val = tail.value;
       tail = secondLast;
       tail.next = null;
       return val;
    }
    public int delete(int index) {
        if(index == 0){
            return deleteFirst();
        }
        if(index == size- 1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
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
    // recursive reverse
    public Node reverse(Node node){
        if(node == tail){
            head = node;
            return head;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
        return tail;
    }
    public void iterativeReverse(){
        if (size < 2) {
            return;
        }
        Node previousNode = null;
        Node present = head;
        Node nextNode = present.next;

        while(present != null){
            present.next = previousNode;
            previousNode = present;
            present = nextNode;
            if (nextNode != null) {
                nextNode = nextNode.next;
            }

        }
        head = previousNode;

    }
    public boolean isPalindrome(Node head){
        Node mid = middleNode(head);
        Node headSecond = reverse(mid);
        Node rereversed = headSecond;
        // compare both halves
        while(head !=null && headSecond != null){
            if(head.value != headSecond.value){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverse(rereversed);
        return head == null || headSecond == null;

    }
    public Node middleNode(Node head){
        Node s = head;
        Node f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public Node find(int value){
        Node node = head;
        while( node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
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

