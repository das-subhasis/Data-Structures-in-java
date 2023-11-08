package Arrays;

import java.util.Arrays;

public class ZeroesToEnd {

    public static int[]  moveZeroes(int[] arr){
        int[] old_arr = arr;
        arr = new int[old_arr.length];
        int count = 0;
        for (int i = 0; i <arr.length; i++) {
            if(old_arr[i]!=0)
                arr[count++] = old_arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        arr = moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
