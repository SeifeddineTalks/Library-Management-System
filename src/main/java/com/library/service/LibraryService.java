package com.library.service;

import com.library.model.Book;
import com.library.util.BookAuthorTitleComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


public class LibraryService {

    private final HashMap<String,Book> booksByISBN;


    public LibraryService(){
        this.booksByISBN=new HashMap<>();
    }


    //methods

    public boolean addBook(Book book){


        if(booksByISBN.containsKey(book.getISBN())){
            System.out.println("Error ISBN: " + book.getISBN() + " already exists in inventory");
            return false;
        }

        else {
            this.booksByISBN.put(book.getISBN(), book);
            System.out.println(book.getTitle()+" of ID: "+book.getItemId()+" has been add to the inventory");
            return true;
        }
    }


    public boolean removeBook(Book book){
        if(this.booksByISBN.containsKey (book.getISBN())){
            this.booksByISBN.remove(book.getISBN());
            System.out.println(book.getTitle() + " with ID: "+ book.getItemId()+ " has been removed from inventory");
            return true;
        }
        else{
            System.out.println(book.getTitle()+ " with ID: "+ book.getItemId()+ " not found in inventory");
            return false;
        }
    }

    public Book findBookByISBN(String isbn){
        return this.booksByISBN.get(isbn);
    }

    public List <Book> sortBooks(){

        Comparator<Book> com = new BookAuthorTitleComparator();
        List<Book> sortedBooks = this.getAllBooks();
        sortedBooks.sort(com);
        return sortedBooks;
    }


    //getter:

    public List<Book> getAllBooks(){
        return new ArrayList<>(this.booksByISBN.values());
    }

    public int getInventorySize(){
        return this.booksByISBN.size();
    }


}
