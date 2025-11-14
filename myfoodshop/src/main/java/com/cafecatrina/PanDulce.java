package com.cafecatrina;

public class PanDulce {
    private String name;
    private boolean warmedUp;
    private double price;

    public PanDulce(String name, boolean warmedUp, double price) {
        this.name = name;
        this.warmedUp = warmedUp;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWarmedUp() {
        return warmedUp;
    }

    public void setWarmedUp(boolean warmedUp) {
        this.warmedUp = warmedUp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
