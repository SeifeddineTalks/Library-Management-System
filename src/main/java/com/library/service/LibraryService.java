package com.library.service;

import com.library.model.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class LibraryService {

    private final List<Book> inventory;
    private final HashMap<String,Book> booksByISBN;
    private final HashSet<String> uniqueISBns;


    public LibraryService(){
        this.inventory=new ArrayList<>();
        this.booksByISBN=new HashMap<>();
        this.uniqueISBns=new HashSet<>();
    }


    //methods

    public boolean addBook(Book book){

        // making sure the isbn is unique per book title ( still need to fix the logic )
        if(uniqueISBns.contains(book.getISBN())){
            System.out.println("Error: ISBN " + book.getISBN() + "already exists in inventory");
            return false;
        }

        else {
            this.inventory.add(book);
            this.booksByISBN.put(book.getISBN(), book);
            this.uniqueISBns.add(book.getISBN());
            System.out.println(book.getTitle()+" of ID: "+book.getItemId()+" has been add to the inventory");
            return true;
        }
    }


    public boolean removeBook(Book book){
        if(this.inventory.contains(book)){
            this.inventory.remove(book);
            this.booksByISBN.remove(book.getISBN());
            this.uniqueISBns.remove(book.getISBN());
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
