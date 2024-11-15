package librarySystem;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Borrower> borrowers;

    public Library() {
        books = new ArrayList<>();
        borrowers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerBorrower(Borrower borrower) {
        borrowers.add(borrower);
    }

    public boolean borrowBook(String bookTitle, Borrower borrower) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle) && book.isAvailable()) {
                book.setAvailable(false);
                System.out.println(borrower.getName() + " borrowed " + bookTitle);
                return true;
            }
        }
        System.out.println("Book not available for borrowing: " + bookTitle);
        return false;
    }

    public void returnBook(String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                book.setAvailable(true);
                System.out.println("Returned: " + bookTitle);
                return;
            }
        }
        System.out.println("Book not found: " + bookTitle);
    }

    public void listBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}


