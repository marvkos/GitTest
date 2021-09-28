package com.company.library;

public abstract class RentableItem extends Item implements Rentable {

    private boolean available;

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
