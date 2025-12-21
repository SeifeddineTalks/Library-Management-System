package com.library.service;

import com.library.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class LibraryService {

    private final List<Book> inventory;
    private final HashMap<String,Book> booksByISBN;


    public LibraryService(){
        this.inventory=new ArrayList<>();
        this.booksByISBN=new HashMap<>();
    }


    //methods

    public void addBook(Book book){
        this.inventory.add(book);
        this.booksByISBN.put(book.getISBN(), book);
        System.out.println(book.getTitle()+" of ID:"+book.getItemId()+" has been add to the inventory");
    }


    public boolean removeBook(Book book){
        if(this.inventory.contains(book)){
            this.inventory.remove(book);
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


    //getter:

    public List<Book> getAllBooks(){
        return this.inventory;
    }

    public int getInventorySize(){
        return this.inventory.size();
    }









}
