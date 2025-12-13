package com.library.model;

public class Magazine extends LibraryItem implements Loanable {

    // TODO Week 3: Move checkout logic to Library service class when we learn collections
    // This violates SRP - Magazine should only store magazine data, not manage loan state

    private final String publisher;
    private final int issueNumber;
    private int month;
    private boolean isCheckedOut=false;


    public Magazine(String title, String publisher, int price, int issueNumber, int month) {
        super(title,price);
        this.publisher=publisher;
        this.issueNumber=issueNumber;
        this.month =month;
    }

    //getters:

    public String getPublisher(){
        return this.publisher;
    }

    public int getIssueNumber(){
        return this.issueNumber;
    }

    public int getMonth(){
        return  this.month;
    }

    public boolean isAvailable(){
        return !this.isCheckedOut;
    }

    //setters

    // TODO: Setters should throw exceptions instead of printing error messages (SRP)

    public void setMonth (int month){
        if(month>12 || month<1){
            System.out.println("this isn't a valid month");
        }
        else{
            this.month=month;
        }
    }

    // Other methods:

    public void displayDetails() {
        System.out.println("Title: " + getTitle() +
                           ", Publisher: " + getPublisher() +
                           ", month: " + getMonth() +
                           ", Issue: " + getIssueNumber() +
                           ", Price: " + getPrice());
    }


    public String getItemType() {
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
