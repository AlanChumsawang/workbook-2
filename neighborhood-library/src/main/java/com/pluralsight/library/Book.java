package com.pluralsight.library;


public class Book {
    private int id;
    private String isbn;
    private String title;
    boolean isCheckedOut;
    String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public void checkOutBook(Book book , String name){
        this.isCheckedOut = true;
        this.checkedOutTo =  name;
    }

    public void checkIn(Book book){
        this.isCheckedOut = false;
        this.checkedOutTo = null;
    }

    public int getID(Book book) {
        return this.id;
    }

    public String printBookDetails(Book book) {
        if (!this.isCheckedOut) {
            return "ID: " + this.getID(book) + " | | " + "Isbn: " + this.isbn + " " + "\n" + this.title + "\n";
        } else {
            return "ID: " + this.getID(book) + " | | " + "Isbn: " + this.isbn + " " + "\n" + this.title + "\n" +
                      this.checkedOutTo + "\n";
        }
    }


}
