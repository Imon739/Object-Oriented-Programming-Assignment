package QueNo2;
import java.util.Scanner;

public class Main {
    public static void displayAll(Book[] books) {
        System.out.println("\nAll Books information:");
        for (Book mybook : books) {
            System.out.println(mybook);
        }
    }
    public static boolean isHeavier(Book mybook) {
        return mybook.getNumberOfPages() > 500;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book[] books = new Book[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("ISBN: ");

            int ISBN = input.nextInt();
            input.nextLine();
            System.out.print("Title: ");

            String title = input.nextLine();
            System.out.print("Number of Pages: ");

            int pages = input.nextInt();
            System.out.print("Count: ");

            int count = input.nextInt();

            books[i] = new Book(ISBN, title, pages, count);
        }

        displayAll(books);

        int Result = books[0].compareTo(books[1]);
        System.out.println("\nComparing the number of pages between the first two books: " + Result);

        System.out.println("\nHeavier than 500 pages? " + isHeavier(books[0]));
    }


}

