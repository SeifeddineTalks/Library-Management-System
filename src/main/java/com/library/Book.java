package com.library;



public class Book extends LibraryItem implements Loanable {
    private final String author;
    private final int year;
    private boolean isCheckedOut=false;

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

    //getters

    String getAuthor() {
        return this.author;
    }

    int getYear(){
        return this.year;
    }

    String getItemType() {
        return "Book";
    }

    boolean isAvailable(){
        return !this.isCheckedOut;
    }



    // Other methods
    void displayDetails() {
        System.out.println("Title: " + getTitle() +
                ", Author: " + getAuthor() +
                ", Year: " + getYear() +
                ", Price: " + getPrice());
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
