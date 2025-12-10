package com.library;

public abstract class LibraryItem {
    private final String title;
    private int price;
    private final int  itemId;
    private static int nextItemId = 1;


    LibraryItem (String title, int price) {
        this.title =title;
        this.price=price;
        this.itemId=nextItemId++;
    }

    // Getters:

    String getTitle() {
        return this.title;
    }

    int getPrice(){
        return this.price;
    }

    int getItemId(){
        return this.itemId;
    }

    // Setters:

    // TODO: Setters should throw exceptions instead of printing error messages (SRP)


    void setPrice(int price) {
        if(price < 0) {
            System.out.println("Price cant be less than zero");
        }
        else {
            this.price=price;
        }
    }


    // other methods
    abstract void displayDetails();

    abstract String getItemType();
}
