package Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class DynamicArray{
    private int[] arr;
    private int capacity;
    private int currentSize;
    private static final int DEFAULT = 10;

    public DynamicArray(){
        arr = new int[DEFAULT];
        capacity = DEFAULT;
        currentSize = 0;
    }

    public void add(int n){
        // If true, resizes the array into twice it's previous size
        if(currentSize == capacity){
            int[] old_arr = arr;
            arr = new int[2 * capacity];
            for (int i = 0; i <old_arr.length; i++) {
                arr[i] = old_arr[i];
            }
            old_arr = null;
            capacity = 2 * capacity;
        }
        arr[currentSize] = n;
        currentSize++;
    }

    public void remove(){
        currentSize --;
    }

    public int getSize(){
        return currentSize;
    }

    public int getCapacity(){
        return capacity;
    }

    public int get(int index){
        if(index < 0 || index >= capacity)
            throw new ArrayIndexOutOfBoundsException(index);
        return arr[index];
    }

    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();
        arr.add(5);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(6);
        arr.add(7);
        arr.remove();
        System.out.println(arr.getSize());
        System.out.println(arr.getCapacity());
        System.out.print(arr.get(39));
    }
}