package com.cafecatrina;

public abstract class Flavor {
    protected String name;
    protected double extraCost;

    public Flavor(String name, double extraCost) {
        this.name = name;
        this.extraCost = extraCost;
    }

    public String getName() {
        return name;
    }

    public double getExtraCost() {
        return extraCost;
    }

    public abstract String getDescription();



}
