
public class BinarySearch {
    /*
     * Best Case in binary search is N/2
     * Worst case in binary search is log2(N)
     * Time Complexity is O(N)
     */

    static int binSort(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Find the middle element
            // int mid = (start + end)/2 // might be possible that (start + end) exceeds the
            // int range
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    // static boolean binSort(int[] arr,int key)
    // {
    // int mid = (int)(arr.length/2);
    // if(arr.length==0)
    // {
    // System.out.println("Array is empty!!");
    // return false;
    // }
    // if(key<=arr[mid])
    // {
    // for(int i =0;i<=mid;i++)
    // {
    // if(arr[i]==key)
    // {
    // return true;
    // }
    // }
    // }
    // else if(key>arr[mid])
    // {
    // for(int i=mid+1;i<arr.length;i++)
    // {
    // if(arr[i]==key)
    // {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 54, 78, 90 };
        int bin = binSort(arr, 54);
        if (bin!=-1) {
            System.out.println(String.format("array found at position %d", bin));
        } else {
            System.out.println("array not found");
        }
    }
}
