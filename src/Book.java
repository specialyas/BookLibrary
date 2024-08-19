public class Book {
}
import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public static class Library {
        private ArrayList<Book> books = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
        }

        public void removeBook(Book book) {
            books.remove(book);
        }

        public void listBooks() {
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");

        library.addBook(book1);
        library.addBook(book2);

        library.listBooks();

        library.removeBook(book1);

        library.listBooks();
    }
}