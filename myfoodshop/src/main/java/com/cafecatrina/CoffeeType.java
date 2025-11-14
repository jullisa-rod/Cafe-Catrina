package com.cafecatrina;
import java.util.ArrayList;


public abstract class CoffeeType {
    private String name;
    private String size;
    private Flavor flavor;

    //private ArrayList<String> flavors;
    public CoffeeType(){

        public class Coffee {
            protected String name;
            protected double basePrice;
            protected ArrayList<Flavor> flavors = new ArrayList<>();
            public Coffee(String name, double basePrice) {
                this.name = name;
                this.basePrice = basePrice;
            }

            public void addFlavor(Flavor flavor) {
                flavors.add(flavor);
            }

            public double getTotalPrice() {
                double total = basePrice;
                for (Flavor f : flavors) {
                    total += f.getExtraCost();
                }
                return total;
            }

            public void printOrder() {
                System.out.println("Coffee: " + name);
                System.out.println("Base Price: $" + basePrice);

                System.out.println("Flavors:");
                for (Flavor f : flavors) {
                    System.out.println(" - " + f.getDescription());
                }

                System.out.println("Total: $" + String.format("%.2f", getTotalPrice()));
            }

        }
    }

}
