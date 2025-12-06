package com.library;

public class Librarian extends User {

    private final int employeeId;

    Librarian (String userName, String email, int employeeId) {
        super(userName, email);
        this.employeeId = employeeId;
    }

    Librarian (String userName, String email, int age, int employeeId) {
        super(userName, email, age);
        this.employeeId = employeeId;
    }

    //get

    int getEmployeeId() {
        return this.employeeId;
    }

    //Other methods

    @Override
    String details () {
    return super.details() + " ,the employee ID is: " + getEmployeeId();
    }

}
