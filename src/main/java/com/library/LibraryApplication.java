package com.library;

public class LibraryApplication {
    static void main(String[] args) {

        // testing setters and getters for the book:

        Book book1 =new Book("One piece", "Oda", 200, 1999 );

        System.out.println("The Tile of the Book is: " + book1.getTitle() +  " ,author: " + book1.getAuthor() +
                            " ,made in year: " + book1.getYear() + " ,price: " + book1.getPrice());

        book1.setPrice(-1);
        book1.setPrice(50);

        System.out.println("The Tile of the Book is: " + book1.getTitle() +  " ,author: " + book1.getAuthor() +
                           " ,made in year: " + book1.getYear() + " ,price: " + book1.getPrice());

        // testing for the user:

        User user1= new User("123seif" , "sifo@gmail.com", 24);

        System.out.println("Username: " + user1.getUserName() + " ,Email: " + user1.getEmail()+
                            " ,Age: " + user1.getAge());

        user1.setAge(0);
        user1.setUserName("_luffy54");
        user1.setEmail("luffy.com");


        // testing for the librarian:

        Librarian librarian1 = new Librarian ("worker", "worker@gmail.com", 40, 37436);

        System.out.println(librarian1.getAge());
        librarian1.setAge(80);
        System.out.println(librarian1.getAge());
    }
}
