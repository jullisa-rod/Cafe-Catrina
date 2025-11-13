package com.cafecatrina;
import java.util.ArrayList;


public class Coffee {
    private String name;
    private double price;
    private ArrayList<String> flavors;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
        this.flavors = new ArrayList<>();

    }

    public Double getPrice() {
        return price;
    }

    public void getflavor() {
        return;
    }

}
