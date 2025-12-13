package com.library.model;

public class User {
    private String userName;
    private String email;
    private int age;

    public User (String userName, String email) {

        this.userName=userName;
        this.email=email;
        this.age=0;
    }

    public User(String userName, String email, int age) {

        this.userName=userName;
        this.email=email;
        this.age=age;
    }


    //to read:

    public String getUserName() {
        return this.userName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getAge() {
        return this.age;
    }

    //to write:

    // TODO: Setters should throw exceptions instead of printing error messages (SRP)

    public void setUserName (String userName){
        if((userName.length() < 4) || (userName.length() > 20) || !Character.isLetterOrDigit(userName.charAt(0))){
            System.out.println("that's not a valid username");
        }
        else{
            this.userName=userName;
        }
    }

    public void setEmail (String email){
        if(email.contains("@") && email.contains(".")) {
            this.email = email;
        }
        else {
            System.out.println("that's not a valid email");
        }
    }

    public void setAge (int age){
        if(age<=0 || age>160){
            System.out.println("that's not a valid age");
        }
        else{
            this.age=age;
        }
    }

    //Other methods

    public String details() {
        return "the name is: " +getUserName()+
                " ,the email is: " +getEmail()+
                " ,the age is: " +getAge();
    }

    public void displayDetails() {
        System.out.println(details());
    }
}
