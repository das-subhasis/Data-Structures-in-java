import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(12);
        set.add(14);
        set.add(15);
        set.add(17);
        set.add(18);
        // ordered randomly
        System.out.println("Set : "+set);
        set.add(18);
        // does not show duplicate value '18'
        System.out.println("Set :" + set);

        // Using the remove, contains method
        set.remove(12);
        System.out.println("Set :" + set);

        System.out.println("14 is present in the set : " + set.contains(14));


    }
}
