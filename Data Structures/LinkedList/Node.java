package LinkedList;

public class Node {
    Node next;
    Node prev;
    int data;

    public Node(){
        this.next = this.prev = null;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
