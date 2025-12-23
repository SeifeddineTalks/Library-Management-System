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

        Book book1 = new Book("harrypotter", "whatever", 40, "H7F5", 2000);
        Book book2 = new Book("harrypotter", "whatever", 40, "H7F5", 2000);


        LibraryService inventory1 = new LibraryService();

        inventory1.addBook(book1);
        inventory1.addBook(book2);
        System.out.println(inventory1.findBookByISBN("H7F5"));


    }

}
