# Library System

This is a simple Java program that simulates a library system. It allows users to add books, borrow books, return books, and display available books.

## Features

- **Add Books**: Add new textbooks or novels to the library.
- **Borrow Books**: Borrow available books from the library.
- **Return Books**: Return borrowed books to the library.
- **Display Books**: Show a list of all currently available books in the library.

## Code Structure

The program consists of the following classes:

- `Book`: An abstract class representing a generic book with properties like title, author, and bookId. It has an abstract method `displayInfo()`.
- `TextBook`: A subclass of `Book` representing a textbook. It includes an additional property `subject`.
- `Novel`: A subclass of `Book` representing a novel. It includes an additional property `genre`.
- `Library`: A class to manage the collection of books. It uses ArrayLists to store available books and borrowed books. It provides methods to add, borrow, return, and display books.
- `LibrarySystem`: The main class with the `main` method to demonstrate the functionality of the library system.

## How to Compile and Run

1.  **Save the code**: Ensure the Java code is saved in a file named `LibrarySystem.java`.
2.  **Compile**: Open a terminal or command prompt, navigate to the directory where you saved the file, and compile the code using the Java compiler:
    ```bash
    javac LibrarySystem.java
    ```
3.  **Run**: After successful compilation, run the program using the following command:
    ```bash
    java LibrarySystem
    ```

## Example Usage

The `main` method in `LibrarySystem.java` provides a simple demonstration:

1.  Creates a new `Library` instance.
2.  Adds a `TextBook` ("Java Programming") and a `Novel` ("The Alchemist") to the library.
3.  Displays the available books.
4.  Borrows the book with ID 1 ("Java Programming").
5.  Displays the available books again (showing "Java Programming" is no longer available).
6.  Returns the book with ID 1.
7.  Displays the available books again (showing "Java Programming" is back in the library).
