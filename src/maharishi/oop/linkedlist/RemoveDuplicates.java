package maharishi.oop.linkedlist;
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/
public class RemoveDuplicates {
    Node head;
    Node tail;
    private int size;
    public  void removeDuplicates(){
        Node node = head;
        while (node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;

            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
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
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size +=1;
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

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        rd.insertFirst(1);
        rd.insertFirst(1);
        rd.insertFirst(2);
        rd.display();
        rd.removeDuplicates();
        rd.display();

    }
}
