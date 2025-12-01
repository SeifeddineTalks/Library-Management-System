package com.library;

public class LibraryApplication {
    static void main(String[] args) {
        Book book1 = new Book();
        User user1 = new User();
        System.out.println(book1.title + " by " + book1.author + " in year: " + book1.year);
        System.out.println("taken by: " + user1.name + " who is: " + user1.age + " and works as: " + user1.job);
    }
}
