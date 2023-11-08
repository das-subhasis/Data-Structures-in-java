package LinkedList;


// Singly Linked List
public class Linked_List {
    private Node head;
    private Node tail;
    private int size;

    public void display(){
        Node list = head;
        if(head == null)
            System.out.println("Nothing to display!!");
        while(list!= null) {
            System.out.print(list.data + "->");
            list = list.next;
        }
        System.out.print("null\n");
    }

    public int getSize(){
        return size;
    }

    public void add(int data){
        // adds a node at the end of the list
        Node node = new Node(data);
        if(size == 0){
            head = tail = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void add_first(int data){
        // adds a node at the start
        Node node = new Node(data);
        node.next = head;
        head = node;
        if(size == 0)
            tail = node;
        size++;
    }
    public void add_at(int data, int index) throws Exception{
        int count = 0;
        Node pointer = head;
        Node node = new Node(data);

        if(index < 0 || index > size)
            throw new Exception("Index out of bounds");

        if(index == 0){
            add_first(data);
            return;
        }

        if(index == size - 1){
            add(data);
            return;
        }

        while(count!=index-1){
            if(pointer.next!= null)
                pointer = pointer.next;
            count+=1;
        }
        node.next = pointer.next;
        pointer.next = node;
    }

    public void remove_first() throws Exception{
        // removes the first node
        if(size == 0)
            throw new Exception("Cannot delete from empty list");
        if(size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        size--;
    }

    public void remove_last() throws Exception{
        // removes the last node
        if(size == 0)
            throw new Exception("Cannot delete from empty list");
        if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }
        Node pointer = head;
//        while(pointer.next.next!= null)
//            pointer = pointer.next;
        for(int hop = 0;hop < size - 2;hop++){
            pointer = pointer.next;
        }
        pointer.next = null;
        tail = pointer;
        size--;
    }

    public void remove_at(int index) throws Exception{
        // removes the last node
        if(size == 0)
            throw new Exception("Cannot delete from empty list");

        if(index < 0 ||  index > size)
            throw new Exception("Index out of bounds");
        Node pointer = head;
//        while(pointer.next.next!= null)
//            pointer = pointer.next;
        if(index == 0){
            remove_first();
            return;
        }

        if(index == size - 1){
            remove_last();
            return;
        }

        for(int hop = 1;hop < index;hop++){
            pointer = pointer.next;
        }

        pointer.next = pointer.next.next;
        size--;
    }

    int getFirst() throws Exception{
        if(size == 0)
            throw new Exception("Linked list is empty");
        return head.data;
    }

    int getLast() throws Exception{
        if(size == 0)
            throw new Exception("Linked list is empty");
        return tail.data;
    }

    int get(int index) throws Exception{
        if(size < 0 || index > size)
            throw new Exception("Index out of bounds");
        if(size == 0)
            throw new Exception("Linked list is empty");
        Node search = head;
        if(index == 0)
            getFirst();

        if (index == size - 1)
            getLast();

        for(int hop = 0;hop <= index; hop++){
            search = search.next;
        }
        return search.data;
    }


    public Linked_List(){
        head = tail =null;
        size = 0;
    }


    public static void main(String[] args) throws Exception {
        Linked_List list = new Linked_List();
        list.add_first(12);
        list.add_first(11);
        list.add_first(10);
        list.add(13);
        list.add(14);
        list.add_at(9,0);
        list.display();
        list.remove_at(1);
        list.display();

        System.out.println(list.size);
    }

}
