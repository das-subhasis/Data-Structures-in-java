import java.util.ArrayList;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int [] array = new int[5]; // Static Array
        ArrayList <Integer> arr = new ArrayList<Integer>(); // Dynamic Array
        for(int i =0;i<4;i++)
        {
            arr.add(i, (i+1)*23);
            array[i] = (i+1)*24;
        }
        System.out.println(arr);
        System.out.println(Arrays.toString(array));
    }

    static void swap(int[] arr,int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
