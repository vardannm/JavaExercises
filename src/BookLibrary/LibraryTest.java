package BookLibrary;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();


        library.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        library.addBook(new Book("1984", "George Orwell"));

        library.listAvailableBooks();
        System.out.println();

        library.borrowBook("Harry Potter");
        library.borrowBook("The Hobbit");

        library.listAvailableBooks();
        System.out.println();


        library.returnBook("Harry Potter");

        library.listAvailableBooks();
    }
}

