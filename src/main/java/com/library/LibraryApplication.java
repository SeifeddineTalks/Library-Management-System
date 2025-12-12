package com.library;

import java.time.LocalDate;

public class LibraryApplication {
    static void main(String[] args) {

        // testing for the book&magazine:

        Book book1 =new Book("One piece", "Oda", 200, 1999 );
        Book book2 =new Book("One piece", "Oda", 200, 1999 );
        LibraryItem magazine1= new Magazine("shonenJump", "Jump",50,7743,10);
        book1.displayDetails();
        magazine1.displayDetails();
        System.out.println("this is a: " + book1.getItemType());
        System.out.println("this is a: " + magazine1.getItemType());
        book1.checkOut();
        book1.returnItem();
        System.out.println("Availability: " + book1.isAvailable());
        System.out.println(book2.getItemId());


        // Creating both librarian and user using The User showing poly:

        User user1= new User("seif", "sifo@gmail.com", 24);
        User librarian1 = new Librarian ("Nada", "Nada@gmail.com",
                                         70, 37436);

        // testing for the librarian and user:

        user1.displayDetails();
        librarian1.displayDetails();


        //testing dates:

        System.out.println(DateUtil.calculateDueDate());
        System.out.println(DateUtil.daysOverdue(LocalDate.of(2025, 12, 15)));
        System.out.println(DateUtil.calculateFine(LocalDate.of(2025, 10, 15)));

    }
}
