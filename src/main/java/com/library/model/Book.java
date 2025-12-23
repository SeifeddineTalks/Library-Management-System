package com.library.model;


import java.lang.foreign.MemorySegment;
import java.util.Objects;

public class Book extends LibraryItem implements Loanable {



    private final String author;
    private final int year;
    private final String ISBN;
    private boolean isCheckedOut=false;

    public Book (String title, String author, int price, String ISBN) {
        super(title,price);
        this.author= author;
        this.ISBN=ISBN;
        this.year =0;
    }

    public Book(String title, String author, int price, String ISBN, int year) {
        super(title,price);
        this.author= author;
        this.ISBN=ISBN;
        this.year =year;
    }

    //getters

    public String getAuthor() {
        return this.author;
    }

    public int getYear(){
        return this.year;
    }

    public String getItemType() {
        return "Book";
    }

    public boolean isAvailable(){
        return !this.isCheckedOut;
    }
    public String getISBN(){
        return this.ISBN;
    }


    // Other methods


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return Objects.equals(this.getISBN(), book.getISBN());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getISBN());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", year=" + getYear() +
                ", ISBN='" + getISBN() + '\'' +
                ", isAvailable=" + isAvailable() +
                '}';
    }

    public void displayDetails() {
        System.out.println("Title: " + getTitle() +
                ", Author: " + getAuthor() +
                ", Year: " + getYear() +
                ", Price: " + getPrice() +
                ", Id: " + getItemId());
    }


    @Override
    public boolean checkOut(){
        if(isCheckedOut){
            return false;
        }
        else {
            this.isCheckedOut=true;
            return true;
        }}

    @Override
    public boolean returnItem(){
        if(isCheckedOut){
            this.isCheckedOut=false;
            return true;
        }
        else{
            return false;
        }

    }

}
