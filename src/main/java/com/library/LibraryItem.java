package com.library;

public abstract class LibraryItem {
    private final String title;
    private int price;


    LibraryItem (String title, int price) {
        this.title =title;
        this.price=price;
    }

    // Getters:

    String getTitle() {
        return this.title;
    }

    String getPrice(){
        return "$" + this.price;
    }

    // Setters:

    void setPrice(int price) {
        if(price < 0) {
            System.out.println("Price cant be less than zero");
        }
        else {
            this.price=price;
        }
    }
    abstract void displayDetails();

    abstract String getItemType();
}
