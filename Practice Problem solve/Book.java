public class Book {
    private int ISBN;
    private String bookTitle;
    private int numberOfPages;
    private static int count; // static variable to count total number of Book objects

    // Constructor to initialize instance variables and increment count
    public Book(int ISBN, String bookTitle, int numberOfPages) {
        this.ISBN = ISBN;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
        count++; // Increment count each time a Book object is created
    }

    // Default constructor
    public Book() {
        // Default constructor can be left empty or implemented as needed
    }

    // toString method to represent Book object as a String
    public String toString() {
        return "Book [ISBN=" + ISBN + ", bookTitle=" + bookTitle + ", numberOfPages=" + numberOfPages + "]";
    }

    // Method to compare two Book objects
    public int compareTo(Book otherBook) {
        return this.numberOfPages - otherBook.numberOfPages;
    }

    // Static method to get the count of total Book objects created
    public static int getCount() {
        return count;
    }

    // Getter method for ISBN
    public int getISBN() {
        return ISBN;
    }

    // Getter method for book title
    public String getBookTitle() {
        return bookTitle;
    }

    // Getter method for number of pages
    public int getNumberOfPages() {
        return numberOfPages;
    }
}
