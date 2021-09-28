package com.company.library;

public class EBook extends Book {

    public EBook(String title) {
        super(title);
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
