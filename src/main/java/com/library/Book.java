package com.library;

public class Book extends LibraryItem {
    private final String author;
    private final int year;

    Book (String title, String author, int price) {
        super(title,price);
        this.author= author;
        this.year =0;
    }

    Book (String title, String author, int price, int year) {
        super(title,price);
        this.author= author;
        this.year =year;
    }



    String getAuthor() {
        return this.author;
    }

    int getYear(){
        return this.year;
    }



    // Other methods
    void displayDetails() {
        System.out.println("Title: " + getTitle() +
                ", Author: " + getAuthor() +
                ", Year: " + getYear() +
                ", Price: " + getPrice());
    }

    String getItemType() {
        return "Book";

    }

}
