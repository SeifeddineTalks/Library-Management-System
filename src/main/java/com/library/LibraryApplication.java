package com.library;

import com.library.service.LibraryService;
import com.library.util.DateUtil;
import java.time.LocalDate;
import java.util.List;

import com.library.model.Book;
import com.library.model.Magazine;
import com.library.model.LibraryItem;
import com.library.model.User;
import com.library.model.Librarian;


public class LibraryApplication {
    static void main(String[] args) {

        // testing for the book&magazine:

        Book book1 =new Book("One piece", "Oda", 200, 1999 );
        Book book2 =new Book("Solo", "Oda", 200, 1999 );
        Book book3 =new Book("solo", "Oda", 200, 1999 );
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
        User librarian1 = new Librarian("Nada", "Nada@gmail.com",
                                         70, 37436);

        // testing for the librarian and user:

        user1.displayDetails();
        librarian1.displayDetails();


        //testing dates:

        System.out.println(DateUtil.calculateDueDate());
        System.out.println(DateUtil.daysOverdue(LocalDate.of(2025, 12, 15)));
        System.out.println(DateUtil.calculateFine(LocalDate.of(2025, 10, 15)));

        //testing inventory :

        System.out.println("-------------------------------------");
        LibraryService inventory1= new LibraryService();
        inventory1.addBook(book1);
        inventory1.addBook(book3);
        inventory1.addBook(book2);
        System.out.println(inventory1.getInventorySize());
        inventory1.removeBook(book2);

        List<Book> allBooks = inventory1.getAllBooks();
        for (int i = 0; i < allBooks.size(); i++) {
            Book book = allBooks.get(i);
            System.out.println("Book N"+(i+1)+":");
            book.displayDetails();
        }
    }
}
