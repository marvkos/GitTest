package com.company;

import com.company.library.Book;
import com.company.library.Library;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Book theHobbit = new Book("The Hobbit");
        Book mobyDick = new Book("Moby Dick");

        if (library.lend(theHobbit)) {
            System.out.println("Success");
        } else {
            System.out.println("Not available");
        }

        if (library.lend(theHobbit)) {
            System.out.println("Success");
        } else {
            System.out.println("Not available");
        }

        if (library.lend(mobyDick)) {
            System.out.println("Success");
        } else {
            System.out.println("Not available");
        }
    }
}
