package com.library;

public class Magazine extends LibraryItem{

    private final String publisher;
    private final int issueNumber;
    private int month;


    Magazine (String title, String publisher, int price, int issueNumber, int month) {
        super(title,price);
        this.publisher=publisher;
        this.issueNumber=issueNumber;
        this.month =month;
    }

    //getters:

    String getPublisher(){
        return this.publisher;
    }

    int getIssueNumber(){
        return this.issueNumber;
    }

    int getMonth(){
        return  this.month;
    }

    //setters

    void setMonth (int month){
        if(month>12 || month<1){
            System.out.println("this isn't a valid month");
        }
        else{
            this.month=month;
        }
    }

    // Other methods:

    void displayDetails() {
        System.out.println("Title: " + getTitle() +
                           ", Publisher: " + getPublisher() +
                           ", month: " + getMonth() +
                           ", Issue: " + getIssueNumber() +
                           ", Price: " + getPrice());
    }



    String getItemType() {
        return "Magazine";
    }
}
