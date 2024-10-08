package com.pluralsight.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Library {

    public static List<Book> libraryInventory;

    public Library(List<Book> libraryInventory) {
        this.libraryInventory = libraryInventory;
    }

    public void addBook(Book newBook) {
        libraryInventory.add(newBook);
    }

    public static void showAvailableBooks() {
        for (Book book : libraryInventory) {
            if (!book.isCheckedOut) {
                System.out.println(book.printBookDetails(book));
            }

        }
    }
    public void addInitialBooks(Library library){
        library.addBook(new Book(9729, "567105", "To Kill a Mockingbird", false, null));
        library.addBook(new Book(2620, "885953", "The Monk Who Sold His Ferrari", true, "Alan Chumsawang"));
        library.addBook(new Book(3687, "107859", "How to become Extremely Intelligent", false, null));
        library.addBook(new Book(1712, "688738", "The Great Gatsby", false, null));
        library.addBook(new Book(8036, "123871", "The 7 Habits Of Highly Effective People", true, "Robert Williams"));
        library.addBook(new Book(5896, "933993", "Mans Search For Meaning", true, "Lex Fridman"));
        library.addBook(new Book(4181, "627269", "Can’t Hurt Me", true, "Elon Musk"));
        library.addBook(new Book(4316, "507378", "The Pragmatic Programmer", true, "Momma Rachel"));
        library.addBook(new Book(5490, "522022", "Mamba", false, null));
        library.addBook(new Book(1889, "405076", "Clean Code", false, null));
        library.addBook(new Book(9728, "567105", "Rewired", false, null));
        library.addBook(new Book(2628, "885953", "Physics of the Future", true, "Michael White"));
        library.addBook(new Book(3688, "107859", "The Alchemist", true, "Unique Person"));
        library.addBook(new Book(1718, "688738", "Critical Thinking and Logic Mastery", true, "Reginald Whittaker"));
        library.addBook(new Book(8038, "123871", "The five dysfunctions of a team", true, "Hugh Xi"));
        library.addBook(new Book(5898, "933993", "The Ultimate Team Player", true, "Ahmad Clyburn"));
        library.addBook(new Book(4188, "627269", "Art of War", false, null));
        library.addBook(new Book(4318, "507378", "The War of Art", true, "Chad Power"));
        library.addBook(new Book(5498, "522022", "The pursuit of happiness", false, null));
        library.addBook(new Book(1888, "405076", "System Thinker", false, null));
    }


    public static void showUnavailableBooks() {
        for (Book book : libraryInventory) {
            if (book.isCheckedOut) {
                System.out.println(book.printBookDetails(book));

            }
        }
    }

    public static void main(String[] args) {
        Scanner inputscanner = new Scanner(System.in);
        Library library = new Library(new ArrayList<>());
        library.addInitialBooks(library);

        boolean isRunning = true;
        while (isRunning) {
            System.out.print("""
                                 ===================================
                                 Welcome to the Neighborhood Library
                                 ===================================
                                \s
                     1: Show Available Books
                     2: Show Checked Out Books
                     3: Exit
                    \s
                     Choose an option:\s
                    \s""");
            int userInput = inputscanner.nextInt();
            inputscanner.nextLine();
            switch (userInput) {
                case 1:
                    showAvailableBooks();
                    System.out.println("""
                            1: Check out an available book
                            2: Return to home screen
                            """);
                    int userInput2 = inputscanner.nextInt();
                    inputscanner.nextLine();
                    int bookID;
                    if (userInput2 == 1) {
                        System.out.print("Enter Your Name : ");
                        String customerName = inputscanner.nextLine();
                        System.out.println("What is the ID of the book?");
                        int bookId = inputscanner.nextInt();
                        inputscanner.nextLine();
                        for (Book book : libraryInventory) {
                            if (bookId == book.getID(book) && !book.isCheckedOut) {
                                System.out.println("\nHere is your book!\nYour return dates is 12/5/2024");
                                book.checkOutBook(book, customerName);
                            }
                        }
                    }
                    break;
                case 2:
                    showUnavailableBooks();
                    System.out.println("""
            1: Check in a book
            2: Return to home screen
            """);
                    int userInput3 = inputscanner.nextInt();
                    inputscanner.nextLine();

                    if (userInput3 == 1) {
                        System.out.print("Enter Book ID : ");
                        int bookId = inputscanner.nextInt();
                        inputscanner.nextLine();
                        for (Book book : libraryInventory) {
                            if (bookId == book.getID(book) && book.isCheckedOut) {
                                book.checkIn(book);
                                System.out.println("\nThank you for returning the book!");
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nGood Bye!");
                    isRunning = false;
                    break;
            }
        }
    }
}



