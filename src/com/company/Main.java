package com.company;

import com.company.library.Book;
import com.company.library.Library;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("The Hobbit");

        if (library.lend(book)) {
            System.out.println("Success");
        } else {
            System.out.println("Not available");
        }

        if (library.lend(book)) {
            System.out.println("Success");
        } else {
            System.out.println("Not available");
        }
    }
}
