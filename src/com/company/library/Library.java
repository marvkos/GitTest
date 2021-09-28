package com.company.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Item> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public boolean lend(Rentable rentable) {
        if (rentable.isAvailable()) {
            rentable.setAvailable(false);
            return true;
        }

        return false;
    }

    public List<Item> getItems() {
        return items;
    }
}
