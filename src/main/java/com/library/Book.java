package com.library;

public class Book {
    private final String title;
    private final String author;
    private int price;
    private final int year;

    Book (String title, String author, int price) {
        this.title=title;
        this.author= author;
        this.price=price;
        this.year =0;
    }

    Book (String title, String author, int price, int year) {
        this.author= author;
        this.title=title;
        this.year =year;
        this.price=price;
    }

    // toRead
    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    int getYear(){
        return this.year;
    }

    String getPrice(){
        return "$" + this.price;
    }

    // toWrite
    void setPrice(int price) {
        if(price < 0) {
            System.out.println("Price cant be less than zero");
        }
        else {
            this.price=price;
        }
    }

    // Other methods
    void displayDetails() {
        System.out.println("Title: " + getTitle() +
                ", Author: " + getAuthor() +
                ", Year: " + getYear() +
                ", Price: " + getPrice());
    }
}
