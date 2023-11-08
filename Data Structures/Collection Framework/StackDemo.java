import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        // Adding new books to the stack
        books.push("Dr. Maniac will treat you now");
        books.push("Kreacher Teacher Final Exam");
        books.push("Dr. Frankenstein");
        System.out.println(books);

        // Displaying the book at the top
        System.out.println("Book last added is "+books.peek());

        // Removing the last added item from the stack
        String removed_item = books.pop();
        System.out.println(String.format("\"%s\" is removed from the book stack",removed_item));

        System.out.println();
        for(String book:books){
            System.out.println(book);
        }

    }
}
