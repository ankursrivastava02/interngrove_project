package librarySystem;


    import java.util.Scanner;
    public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding some books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("1984", "George Orwell"));

        // Registering borrowers
        library.registerBorrower(new Borrower("Alice"));
        library.registerBorrower(new Borrower("Bob"));

        // Menu for library management
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. List Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    library.listBooks();
                    break;
                case 2:
                    System.out.print("Enter the book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String borrowerName = scanner.nextLine();
                    Borrower borrower = new Borrower(borrowerName);
                    library.borrowBook(borrowTitle, borrower);
                    break;
                case 3:
                    System.out.print("Enter the book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}


