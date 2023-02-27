// import java.util.Scanner;

public class linearSearching {
    public static void main(String[] args) {
        // int[] arr = { 22, 15, 16, 14, 19, 20 };
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter key Search Element: ");
        // int key = in.nextInt();

        // Best Case Scenario O(n) = 1 [Constant]
        // Element Found at the First Index
        // char key = 'a';
        // System.out.println(searchInString("Rohit", key));

        // Worst Case Scenario O(n)
        // Element Not Found at all
        int[][] accounts = {{1,5},{3,7},{5,6}};
        // key = 64;
        // System.out.println(linearSearch(arr, key, 2, 6));
        System.out.println(maxWealth(accounts));
        // System.out.println(searchEven(arr));
    }

    static int linearSearch(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    static int searchInString(String item, char element) {
        for (int chr : item.toCharArray()) {
            if (chr == element) {
                return 1;
            }
        }
        return -1;
    }

    // Linear search with range
    static int linearSearch(int[] arr, int ele, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i < arr.length)
                if (arr[i] == ele) {
                    return i;
                }

        }
        return -1;
    }

    static int searchMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int searchMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int search2D(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; i++) {
                if (arr[i][j] == key) {
                    return arr[i][j];
                }
            }
        }
        return -1;
    }

    static int search3D(int[][][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = 0; k < arr[0].length; k++)
                    if(arr[i][j][k]==key)
                    {
                        return arr[i][j][k];
                    }
            }
        }
        return -1;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (digits(nums[i]) % 2 == 0)
                count++;
        }
        return count;
    }

    public int digits(int digit) {

        if (digit < 0) {
            digit = digit * -1;
        }
        return (int) (Math.log10(digit)) + 1;
    }

    static int maxWealth(int[][] accounts) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(max<sum)
            {
                max = sum;
                sum=0;
            }
            
        }
        return max;
    }

}
