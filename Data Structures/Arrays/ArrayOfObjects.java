import java.util.Arrays;

class Book{

    int isbn;
    int price;
    String name;

    public Book(String name,int isbn,int price){
        this.name = name;
        this.isbn = isbn;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("{%s, %d, %d}",name,isbn,price);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Book book1 = new Book("Java",1211,231);
        Book book2 = new Book("C++",1212,265);
        Book book3 = new Book("Python",1213,221);

        Book[] library = new Book[3];

        library[0] = book1;
        library[1] = book2;
        library[2] = book3;

        System.out.println(Arrays.toString(library));

        Arrays.sort(library,(b1,b2) -> (b1.price - b2.price));

        System.out.println(Arrays.toString(library));
    }
}
