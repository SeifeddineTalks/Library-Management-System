package com.library.service;

import com.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private List<Book> inventory;

    public LibraryService(){
        this.inventory=new ArrayList<>();
    }

    public void addBook(Book book){
        this.inventory.add(book);
        System.out.println(book.getTitle()+" of ID:"+book.getItemId()+" has been add to the inventory");
    }

    public boolean removeBook(Book book){
        if(this.inventory.contains(book)){
            this.inventory.remove(book);
            System.out.println(book.getTitle() + " with ID: "+ book.getItemId()+ " has been removed from inventory");
            return true;
        }
        else{
            System.out.println(book.getTitle()+ " with ID: "+ book.getItemId()+ " not found in inventory");
            return false;
        }
    }

    public List<Book> getAllBooks(){
        return this.inventory;
    }

    public int getInventorySize(){
        return this.inventory.size();
    }









}
