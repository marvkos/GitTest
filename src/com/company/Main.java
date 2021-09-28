package com.company;

import com.company.library.*;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        EBook theHobbit = new EBook("The Hobbit");
        PhysicalBook mobyDick = new PhysicalBook("Moby Dick");
        CD cd = new CD("Tracks Tracks Tracks");
        Printer printer = new Printer();

        if (library.lend(cd)) {
            System.out.println("Success");
        } else {
            System.out.println("Not available");
        }

        if (library.lend(cd)) {
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
