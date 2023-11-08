package Queue;

import java.util.Arrays;

public class Queue {
    private int[] arr;
    private int size;
    private int front;
    private int rear;
    private int capacity;
    public static final int DEFAULT_CAPACITY = 10;

    public Queue() throws Exception {
        this(DEFAULT_CAPACITY);
    }
    public Queue(int capacity) throws Exception{
        if(capacity < 1){
            throw new Exception("Invalid Capacity!");
        }
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
        this.front = 0;
    }

    boolean isFull(){
        return this.size == this.arr.length;
    }

    boolean isEmpty(){
        return this.size == 0;
    }

    public void enqueue(int value) throws Exception{
        // Queue is full
        if(isFull()){
            throw new Exception("Queue is full");
        }
        int rear = (this.front + this.size) % this.arr.length;
        this.arr[rear] = value;
        this.size++;
    }
    //O(1)
    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int output = this.arr[this.front];
        this.front = (this.front + 1) % capacity;
        this.size--;
        return output;
    }

    //O(1)
    public int peek() throws Exception{
        if(this.size == 0){
            throw new Exception("Queue is Empty");
        }
        return this.arr[this.front];
    }


    public int size(){
        return (this.size);
    }

    public void display(){
//        System.out.println(Arrays.toString(this.arr));
        for (int i = 0; i < this.size; i++) {
            int idx = (this.front + i) % this.arr.length;
            System.out.println(this.arr[idx] + ",");
        }
        System.out.println();
    }

}
