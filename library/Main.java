package library;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("자바의 정석","XXX", true);

        Library library = new Library();
        Book book = new Book("자바의정석", "XXX", true);

        library.addBook(book);


    }
}
