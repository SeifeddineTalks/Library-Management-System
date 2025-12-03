package com.library;

public class User {
    private String userName;
    private String email;
    private int age;

    User (String userName, String email) {

        this.userName=userName;
        this.email=email;
        this.age=0;
    }

    User (String userName, String email, int age) {

        this.userName=userName;
        this.email=email;
        this.age=age;
    }

    //to read:

    String getUserName() {
        return this.userName;
    }

    String getEmail() {
        return this.email;
    }

    int getAge() {
        return this.age;
    }

    //to write:

    void setUserName (String userName){
        if(userName.length()<4 || userName.length()>20 || !Character.isLetterOrDigit(userName.charAt(0))){
            System.out.println("that's not a valid username");
        }
        else{
            this.userName=userName;
        }
    }
    void setEmail (String email){
        if(email.contains("@") && email.contains(".")) {
            this.email = email;
        }
        else {
            System.out.println("that's not a valid email");
        }
    }
    void setAge (int age){
        if(age<=0){
            System.out.println("that's not a valid age");
        }
        else{
            this.age=age;
        }
    }
}
