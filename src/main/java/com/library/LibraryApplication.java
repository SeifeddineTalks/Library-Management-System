package com.library;

public class LibraryApplication {
    static void main(String[] args) {
        Book book1 = new Book("One Piece", "Odachi");
        User user1 = new User("Panguin", "Panguin@gmail.com");
        User user2 = new User("Cat", "Cat@gmail.com", 22);

        System.out.println(user1.userName);
        System.out.println(user1.email);
        System.out.println(user2.userName);
        System.out.println(user2.email);
        System.out.println(user2.age);
        System.out.println(book1.title);
        System.out.println(book1.author);
    }
}
