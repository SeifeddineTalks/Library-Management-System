package com.library;

public class LibraryApplication {
    static void main(String[] args) {

        // testing for the book&magazine:

        Book book1 =new Book("One piece", "Oda", 200, 1999 );
        LibraryItem magazine1= new Magazine("shonenJump", "Jump",50,7743,10);
        book1.displayDetails();
        magazine1.displayDetails();
        System.out.println("this is a: " + book1.getItemType());
        System.out.println("this is a: " + magazine1.getItemType());

        // Creating both librarian and user using The User showing poly:

        User user1= new User("seif", "sifo@gmail.com", 24);
        User librarian1 = new Librarian ("Nada", "Nada@gmail.com",
                                         70, 37436);

        // testing for the librarian and user:

        user1.displayDetails();
        librarian1.displayDetails();
    }
}
