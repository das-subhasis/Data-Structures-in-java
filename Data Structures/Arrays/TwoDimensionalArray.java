package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class TwoDimensionalArray {
    static void traverse(int[][] arr){
        System.out.println("2-D Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] arr_get(int[][] arr){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(String.format("Row %d :\n",i+1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter value = ");
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] array_2d = {{1, 2}, {3, 4}};
        traverse(array_2d);

        // Creating a 2-d array and reading it
        System.out.print("Enter no. of rows = ");
        int n = in.nextInt();
        System.out.print("Enter no. of columns = ");
        int m = in.nextInt();
        int[][] cust_arr = new int[n][m];
        cust_arr = arr_get(cust_arr);
        traverse(cust_arr);
    }
}
