import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortUsingSumDigits {


    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(19);
        A.add(22);
        A.add(12);
        A.add(4);
        System.out.println(A);

        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return getSum(a) - getSum(b);
            }
        });

        // Using Lambda functions
        // Collections.sort(A, (a,b) ->(getSum(a) - getSum(b)));

        System.out.println(A);
    }

    public static int getSum(Integer num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
