import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> books = new LinkedList<>();

        // Adding new books to the queue
        books.add("Dr. Maniac will treat you now");
        books.add("Kreacher Teacher Final Exam");
        books.add("Dr. Frankenstein");
        System.out.println(books);

        // Displaying the book at the top
        System.out.println("Book last added is "+books.peek());

        // Removing the first added item from the queue
        String removed_item = books.poll();
        System.out.println(String.format("\"%s\" is removed from the book stack",removed_item));

        System.out.println();
        for(String book:books){
            System.out.println(book);
        }

    }
}
