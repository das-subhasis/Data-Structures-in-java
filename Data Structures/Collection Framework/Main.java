import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void sortInt(){
//      Sort integer array
        int[] roll = {4,2,1,3,5};
        System.out.println("Before Sort:\n" + Arrays.toString(roll) );
        Arrays.sort(roll);
        System.out.println("After Sort:\n"+Arrays.toString(roll));
    }

    public static void sortString(){
//        Sort String array
        String[] fruits = {"Orange","Apple","Grape","Banana","Lemon"};
        System.out.println("Before sort: "+Arrays.toString(fruits));
        Arrays.sort(fruits);
        System.out.println("After sort: "+Arrays.toString(fruits));
    }

    public static void main(String[] args){
        sortInt();
        sortString();
        System.out.println();
    }
}
