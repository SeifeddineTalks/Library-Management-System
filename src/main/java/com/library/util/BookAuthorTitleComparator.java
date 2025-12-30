package com.library.util;

import com.library.model.Book;

import java.util.Comparator;

public class BookAuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {

        int authorCompare =  b1.getAuthor().compareTo(b2.getAuthor());

        if(authorCompare != 0) {
            return  authorCompare;
        }

        else {
            return b1.getTitle().compareTo(b2.getTitle());
        }

    }
}
