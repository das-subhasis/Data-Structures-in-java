import java.util.Scanner;

class switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("Sweet and Delicious");
            default -> System.out.println("Healthy for body");
        }
        in.close();
    }
}