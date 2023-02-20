import java.util.ArrayList;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int [] array = new int[5];
        ArrayList <Integer> arr = new ArrayList<Integer>(); // Dynamic Array
        for(int i =0;i<4;i++)
        {
            arr.add(i, (i+1)*23);
            array[i] = (i+1)*24;
        }
        // for(int i =1;i<4;i++)
        // {
        //     System.out.println(arr.get(i));
        // }
        System.out.println(arr);
        System.out.println(Arrays.toString(array));
    }
}
