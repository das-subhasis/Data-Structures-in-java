package Arrays;

import java.util.Arrays;

public class LargestThreeElements {

    public static void getMax3(int[] arr){
        Arrays.sort(arr);
        for (int i = arr.length - 3; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};
        getMax3(arr);
    }
}
