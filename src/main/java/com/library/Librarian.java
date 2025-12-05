package com.library;

public class Librarian extends User {

    private int employeeId;

    Librarian (String userName, String email, int employeeId) {
        super(userName, email);
        this.employeeId = employeeId;
    }

    Librarian (String userName, String email, int age, int employeeId) {
        super(userName, email, age);
        this.employeeId = employeeId;
    }

    void setEmployeeId (int employeeId) {
        this.employeeId=employeeId;
    }

    int getEmployeeId() {
        return this.employeeId;
    }
}
