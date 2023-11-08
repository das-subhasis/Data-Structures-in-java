package LinkedList;





public class Double_Linked_list {
    private int size;
    private Node head;
    private Node tail;


    public Double_Linked_list(){
        head = tail = null;
        size = 0;
    }

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

    void add_at(int data, int index) throws Exception{
        if(index < 0 || index > size)
            throw new Exception("Index out of bounds");
        if(size == 0) {
            addFirst(data);
            return;
        }

        if(index == size) {
            addLast(data);
            return;
        }
        Node node = new Node(data);
        int mid = (size/2);

        if(index < mid){
            Node search = head;
            for(int hop = 0;hop < index;hop++){
                search = search.next;
            }
            search.prev.next = node;
            node.prev = search.prev;
            node.next = search;
            search.prev = node;
        }
        else{
            Node search = tail;
            for(int hop = mid; hop < index; hop++){
                search = search.prev;
            }
            search.prev.next = node;
            node.prev = search.prev;
            node.next = search;
            search.prev = node;
        }
        size++;
    }

    void addFirst(int data){
        Node node = new Node(data);
        if(size == 0){
            head = tail = node;
        }
        else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    void addLast(int data){
        Node node = new Node(data);
        if(size == 0){
            head = tail = null;
        }
        else {
            node.prev = tail;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void remove_at(int index) throws Exception{
        if(index < 0 || index > size){
            throw new Exception("Index out of bounds");
        }

        if(size == 1){
            head = tail = null;
        }

        if(index == 0){
            removeFirst();
            return;
        }

        if(index == size - 1){
            removeLast();
            return;
        }

        int mid = size / 2;
        Node search;

        if(index < mid){
            search = head;
            for(int hop = 0;hop < index;hop++){
                search = search.next;
            }
        }
        else {
            search = tail;
            for(int hop = mid;hop < index;hop++){
                search = search.prev;
            }
        }
        search.prev.next = search.next;
        search.next.prev = search.prev;
        size--;
    }

    void removeFirst() throws Exception{
        if(size == 0){
            throw new Exception("Linked list is empty");
        }

        if(size == 1){
            head = tail = null;
        }
        else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    void removeLast() throws Exception{
        if(size == 0){
            throw new Exception("Linked list is empty");
        }
        if(size == 1){
            head = tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    int get(int index) throws Exception{
        if(index < 0 || index > size){
            throw new Exception("Index out of bounds");
        }

        if(size == 0){
            throw new Exception("Linked list is empty");
        }

        if(index == 0){
            return getFirst();
        }

        if(index == size - 1){
            return getLast();
        }

        int mid = size / 2;

        Node search;

        if(index < mid){
            search = head;
            for(int hop = 0;hop < index;hop++){
                search = search.next;
            }
        }
        else {
            search = tail;
            for(int hop = mid;hop < index;hop++){
                search = search.prev;
            }
        }
        return search.data;
    }

    int getFirst() throws Exception{
        if(size == 0){
            throw new Exception("Linked list is empty");
        }
        return head.data;
    }

    int getLast() throws Exception{
        if(size == 0){
            throw new Exception("Linked list is empty");
        }
        return tail.data;
    }

    public static void main(String[] args) throws Exception {
        Double_Linked_list list = new Double_Linked_list();
        list.addFirst(12);
        list.addFirst(11);
        list.addFirst(10);
        list.addFirst(13);
        list.addFirst(14);
        list.add_at(9,0);
        list.display();
        list.remove_at(1);
        list.display();

        System.out.println(list.size);

    }

}
