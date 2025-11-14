package com.cafecatrina;

public class HotChocolate extends MenuItem {
    private String name;
    private boolean whippedCream;
    private double price;

    public HotChocolate(String name, boolean whippedCream, double price) {
        this.name = name;
        this.whippedCream = whippedCream;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
