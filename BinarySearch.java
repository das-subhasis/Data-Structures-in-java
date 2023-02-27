
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

    // Q.: Find the floor of a number
    /* Biggest number smaller than or equal to target */
    static int floor(int[] arr, int target) {
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
        return end;
    }

    // Q.: Find smallest letter greater than target
    static char smallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                return letters[mid];
            }
        }
        return letters[start % letters.length];
    }

    // Q.: Find first and last position of element in sorted array
    // {11,24,56,56,32}
    static int[] searchRange(int[] arr, int target) {
        int start = 0;
        int[] pos = { -1, -1 };
        int end = arr.length - 1;
        while (i < 2) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }

                else {
                    ;
                }
            }
            return pos;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 11, 24, 56, 56, 32 };
        // int[] arr2 = { 90, 78, 54, 3, 2, 1 };
        // int bin = binSortOA(arr, 54);
        // int ceil = ceil(arr, 4);
        // int floor = floor(arr, 76);
        // // if (bin != -1) {
        // System.out.println(String.format("array found at position %d", bin));
        // System.out.println(String.format("ceil of the given array %d", arr[ceil]));
        // System.out.println(String.format("floor of the given array %d", arr[floor]));
        // } else {
        // System.out.println("array not found");
        // }
        // System.out.println(searchRange(nums, 56));
    }
}
