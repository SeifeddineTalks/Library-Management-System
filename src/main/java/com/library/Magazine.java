package com.library;

public class Magazine extends LibraryItem implements Loanable{

    private final String publisher;
    private final int issueNumber;
    private int month;
    private boolean isCheckedOut=false;


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

    boolean getIsAvailable(){
        return !this.isCheckedOut;
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
