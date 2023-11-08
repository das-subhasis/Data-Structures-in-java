package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        // Read N numbers and print them in reverse order
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of values you want to print : ");
        int n = in.nextInt();
        int[] num_array = new int[n];

        for (int i = num_array.length - 1; i >=0 ; i--) {
            System.out.print("Enter value : ");
            num_array[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(num_array));
    }
}
