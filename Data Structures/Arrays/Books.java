package Arrays;

import java.util.HashSet;
import java.util.Objects;

public class Books {

    int isbn;
    int price;
    String name;
    public Books(int isbn, String name, int price){
        this.isbn = isbn;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{%d, %s, %d}",isbn,name,price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }



    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        Books b = (Books) obj;
        return isbn == b.isbn;

    }

    public static void main(String[] args) {
        HashSet<Books> book = new HashSet<>();
        book.add(new Books(1,"Python",243));
        book.add(new Books(2,"Machine Learning",219));
        book.add(new Books(1,"Python",243));
        System.out.println(book);
        /* We can see that the duplicate values are repeated,
        * for avoiding this we have to override the equals method
        * */



    }

}
