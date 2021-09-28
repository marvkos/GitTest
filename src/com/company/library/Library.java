package com.company.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public boolean lend(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            return true;
        }

        return false;
    }

    public List<Book> getBooks() {
        return books;
    }
}
