package com.library.model;

public abstract class LibraryItem {
    private final String title;
    private int price;
    private final int  itemId;
    private static int nextItemId = 1;


    protected LibraryItem (String title, int price) {
        this.title =title;
        this.price=price;
        this.itemId=nextItemId++;
    }

    // Getters:

    public String getTitle() {
        return this.title;
    }

    public int getPrice(){
        return this.price;
    }

    public int getItemId(){
        return this.itemId;
    }

    // Setters:

    // TODO: Setters should throw exceptions instead of printing error messages (SRP)


    public void setPrice(int price) {
        if(price < 0) {
            System.out.println("Price cant be less than zero");
        }
        else {
            this.price=price;
        }
    }


    // other methods
    public abstract void displayDetails();

    public abstract String getItemType();
}
