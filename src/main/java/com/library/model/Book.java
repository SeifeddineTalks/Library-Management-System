package com.library.model;


public class Book extends LibraryItem implements Loanable {

    // TODO Week 3: Move checkout logic to Library service class when we learn collections
    // This violates SRP - Book should only store book data, not manage loan state

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
