package com.library.model;

public class Librarian extends User {

    private final int employeeId;

     public Librarian (String userName, String email, int employeeId) {
        super(userName, email);
        this.employeeId = employeeId;
    }

    public Librarian(String userName, String email, int age, int employeeId) {
        super(userName, email, age);
        this.employeeId = employeeId;
    }

    //get

    public int getEmployeeId() {
        return this.employeeId;
    }

    //Other methods

    @Override
    public String details () {
    return super.details() + " ,the employee ID is: " + getEmployeeId();
    }

}
