package com.cafecatrina;

public class RegularFlavor extends Flavor{
    public RegularFlavor(String name) {
        super(name, 0.0);
    }
    @Override
    public String getDescription() {
        return name = "(included)";
    }
}
