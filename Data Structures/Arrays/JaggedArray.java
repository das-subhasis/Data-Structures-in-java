package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        // JaggedArray -> array having variable no. of columns in each row
        int[][] arr = {{1,2},{3,4,5},{6,7,8}};
        System.out.println(Arrays.deepToString(arr));

        // Creating a custom jagged array
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of rows = ");
        int n = in.nextInt();
        int[][] arr_jag = new int[n][];
        for (int i = 0; i < arr_jag.length; i++) {
            System.out.print("Enter columns at current row = ");
            int columnsAtCurrentIndex = in.nextInt();
            arr_jag[i] = new int[columnsAtCurrentIndex];
            System.out.print("Enter values = ");
            for (int j = 0; j < columnsAtCurrentIndex; j++) {
                arr_jag[i][j] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr_jag));
    }
}
