
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

    // Order Agnostic Binary Search - binary sorting an array when it's status is
    // unknown (sorted/unsorted/Ascendiing/Descending)
    static int binSortOA(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] > arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        } else if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    // Q. :: Ceiling of an array
    /* least number in array which is greater than or equal to target value */
    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] > arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        } else if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 54, 78, 90 };
        int[] arr2 = { 90, 78, 54, 3, 2, 1 };

        int bin = binSortOA(arr, 54);
        int bin2 = binSortOA(arr2, 11);
        int ceil = ceil(arr, 55);
        if (bin != -1) {
            System.out.println(String.format("array found at position %d", bin));
            System.out.println(String.format("ceil of the given array %d", arr[ceil]));
        } else {
            System.out.println("array not found");
        }
    }
}
