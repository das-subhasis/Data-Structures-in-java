package Arrays;

public class SubArray {

    public static void getSubarray(int[] arr,int start,int end){
        if(end == arr.length)
            return;
        if(start > end)
            getSubarray(arr,0,end + 1);
        else {
            System.out.print("[");
            for (int i = start; i < end; i++) {
                System.out.print(arr[i]+",");
            }
            System.out.print(arr[end]+"] ");
            getSubarray(arr,start+1,end);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        getSubarray(arr,0,0);
    }
}
