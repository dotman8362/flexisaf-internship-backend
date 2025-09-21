// Class representing a Book
class Book {
    String title;
    String author;
    String isbn;

    // Constructor
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Display book details
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

// Main class
public class BookManager {
    public static void main(String[] args) {
        // Create an array to store books (max 5 books)
        Book[] books = new Book[5];
        int count = 0; // To keep track of how many books are in the array

        // Add some books
        books[count++] = new Book("Java Programming", "ADEDOTUN IDOWU", "12345");
        books[count++] = new Book("Data Structures", "ADEDOTUN IDOWU", "67890");
        books[count++] = new Book("Algorithms", "ADEDOTUN IDOWU", "11223");

        // Display all books
        System.out.println("All books in the collection:");
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
        }

        // Remove a book by ISBN
        String removeIsbn = "67890";
        for (int i = 0; i < count; i++) {
            if (books[i].isbn.equals(removeIsbn)) {
                System.out.println("\nRemoving book: " + books[i].title);
                // Shift remaining books left
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null; // Optional: clear last slot
                count--; // Decrease count
                break;
            }
        }

        // Display books after removal
        System.out.println("\nBooks after removal:");
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
        }
    }
}
