package com.library;

import com.library.service.LibraryService;
import com.library.util.BookAuthorTitleComparator;
import com.library.util.DateUtil;
import java.time.LocalDate;
import java.util.*;

import com.library.model.Book;
import com.library.model.Magazine;
import com.library.model.LibraryItem;
import com.library.model.User;
import com.library.model.Librarian;


public class LibraryApplication {
    static void main(String[] args) {



        LibraryService inventory1 = new LibraryService();

        String[] authors = {"Smith", "Jones", "Smith", "Davis", "Jones"};
        String[] titles = {"Zoo", "Apple", "Banana", "Elephant", "Zebra"};

        for (int i = 0; i < authors.length; i++) {
            Book book = new Book(titles[i], authors[i], 20 + i, "ISBN" + i, 2020 + i);
            inventory1.addBook(book);
        }



        System.out.println(inventory1.sortBooks());












    }

}
