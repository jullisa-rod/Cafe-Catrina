package com.cafecatrina;

public class PremiumFlavor extends Flavor {
    public PremiumFlavor(String name) {
        super(name, 0.50);
    }
    @Override
    public String getDescription() {
        return name + "(+$0.50)";
    }
}
