import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionInterfaceDemo {
    public static void main(String[] args) {
        // Initializing an ArrayList
        ArrayList<String> Arr = new ArrayList<>();
        Arr.add("Interstellar");
        Arr.add("Oppenheimer");
        Arr.add("Oppenheimer");

        // Printing each element in the list
        for(String arr:Arr){
            System.out.print(arr+" ");
        }
        System.out.println();

        // Printing the sie of the element
        int size = Arr.size();
        System.out.println(size);

        // Creating a new list and adding the previous list
        ArrayList<String> Arr2 = new ArrayList<>();
        Arr2.addAll(Arr);
        System.out.println(Arr2);

        // Removing an element from the list
        Arr.remove("Interstellar"); // Reference by element
        Arr.remove(1); // Reference by index
        System.out.println(Arr);

        // Selecting elements from the list
        String movie = Arr.get(0);
        System.out.println("Movie : "+movie);

        // Replacing an element from the list
        Arr.set(0,"Batman: The Dark Knight");
        movie = Arr.get(0);
        System.out.println("Movie : "+movie);

        Iterator<String> it = Arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

