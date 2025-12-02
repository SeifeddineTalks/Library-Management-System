package com.library;

public class Book {
    String title;
    String author;
    int year;

    Book (String title, String author) {
        this.title=title;
        this.author= author;
        this.year =0;
    }

    Book (String title, String author, int year) {
        this.author= author;
        this.title=title;
        this.year =year;
    }
}
