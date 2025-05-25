import java.util.ArrayList;

// Abstract class representing a book
abstract class Book {
    String title;
    String author;
    int bookId;

    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
    }

    abstract void displayInfo();
}

// Subclass for TextBook
class TextBook extends Book {
    String subject;

    public TextBook(String title, String author, int bookId, String subject) {
        super(title, author, bookId);
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println("Textbook: " + title + " by " + author + " (Subject: " + subject + ")");
    }
}

// Subclass for Novel
class Novel extends Book {
    String genre;

    public Novel(String title, String author, int bookId, String genre) {
        super(title, author, bookId);
        this.genre = genre;
    }

    @Override
    void displayInfo() {
        System.out.println("Novel: " + title + " by " + author + " (Genre: " + genre + ")");
    }
}

// Library class to manage books
class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Book> borrowedBooks = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(int bookId) {
        for (Book book : books) {
            if (book.bookId == bookId) {
                books.remove(book);
                borrowedBooks.add(book);
                System.out.println("Borrowed: " + book.title);
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(int bookId) {
        for (Book book : borrowedBooks) {
            if (book.bookId == bookId) {
                borrowedBooks.remove(book);
                books.add(book);
                System.out.println("Returned: " + book.title);
                return;
            }
        }
        System.out.println("Book not found in borrowed list!");
    }

    public void displayBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

// Main class to test the library system
public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        TextBook book1 = new TextBook("Java Programming", "John Doe", 1, "Computer Science");
        Novel book2 = new Novel("The Alchemist", "Paulo Coelho", 2, "Fiction");

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        library.borrowBook(1);
        library.displayBooks();

        library.returnBook(1);
        library.displayBooks();
    }
}