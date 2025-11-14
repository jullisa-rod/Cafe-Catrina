package com.cafecatrina;
import java.util.ArrayList;
import java.util.Scanner;


public class CoffeeMaker {

    private static Scanner scanner = new Scanner(System.in);
    public static Coffee makeCoffee() {
        System.out.println("Build your coffee!");
        String name = getName();
        String size = getSize();
        double price;
        if (size.equalsIgnoreCase("S")) {
           price = 4.50;
        }
        else if (size.equalsIgnoreCase("M")) {
            price = 5.00;
        }
        else {
            price = 5.50;
        }
        Coffee coffee = new Coffee(name, size, price);
        return coffee;
    }
    private static String getName() {

        boolean running = true;
        String name = "";

        while (running) {
            System.out.println("Choose your Coffee Option:");
            System.out.println("l. Latte");
            System.out.println("m. Macchiato");
            System.out.println("c. Café de Olla");
            System.out.print("Enter a character here: ");

            String coffeeType = scanner.nextLine();

            switch (coffeeType) {

                case "l":
                    name = "Latte";
                    running = false;
                    break;

                case "m":
                    name = "Macchiato";
                    running = false;
                    break;

                case "c":
                    name = "Cafe de Olla";
                    running = false;
                    break;

                default:
                    System.out.println("Try again");
                    break;
            }
        }
        return name;
    }

    private static String getSize() {
        System.out.println("1. Small  ($4.50)");
        System.out.println("2. Medium ($5.00)");
        System.out.println("3. Large  ($5.50)");
        System.out.print("Enter size: ");

        String sizeChoice = scanner.nextLine();

        switch (sizeChoice) {

            case "1":
                System.out.println("Size Small selected.");
                return "S";

            case "2":
                System.out.println("Size Medium selected.");
                return "M";

            case "3":
                System.out.println("Size Large selected.");
                return "L";

            default:
                System.out.println("Invalid size, defaulting to Small.");
                return "S";
        }
    }
}





//public void addLatte() {


    //        public class Coffee {
//            protected String name;
//            protected double basePrice;
//            protected ArrayList<Flavor> flavors = new ArrayList<>();
//            public Coffee(String name, double basePrice) {
//                this.name = name;
//                this.basePrice = basePrice;
//            }
//
//            public void addFlavor(Flavor flavor) {
//                flavors.add(flavor);
//            }
//
//            public double getTotalPrice() {
//                double total = basePrice;
//                for (Flavor f : flavors) {
//                    total += f.getExtraCost();
//                }
//                return total;
//            }
//
//            public void printOrder() {
//                System.out.println("Coffee: " + name);
//                System.out.println("Base Price: $" + basePrice);
//
//                System.out.println("Flavors:");
//                for (Flavor f : flavors) {
//                    System.out.println(" - " + f.getDescription());
//                }
//
//                System.out.println("Total: $" + String.format("%.2f", getTotalPrice()));
//            }
//
//        }
   // }
