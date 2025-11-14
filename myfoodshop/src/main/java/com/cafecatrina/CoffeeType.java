package com.cafecatrina;
import java.util.ArrayList;
import java.util.Scanner;


public class CoffeeType {
    private static Scanner scanner = new Scanner(System.in);
    public static void show(ArrayList < CoffeeItems > OrderItems) {

    {
        boolean running = true;
        while (running) {

            System.out.println("Build your coffee!");
            System.out.println("Choose your Coffee Option:");
            System.out.println("l. Latte");
            System.out.println("m. Macchiato");
            System.out.println("c. Café de Olla");
            System.out.println("x. Exit");
            System.out.print("Enter a character here: ");
            String coffeeType = scanner.nextLine();

            switch (coffeeType) {
                case "l":
                    System.out.println("add latte");
                    //addLatte(OrderItems);
                    break;

                case "m":
                    System.out.println("macchiato");
                    //addMacchiato(OrderItems);
                    break;

                case "c":
                    System.out.println("cafe de olla");
                    //addCafeDeOlla(OrderItems);
                    break;

                case "x":
                    running = false;
                    continue;
                default:
                    System.out.println("try again");
                    continue;


//                System.out.println("Chose your Size:");
//                System.out.println("1. Small ($4.50)");
//                System.out.println("2. Medium ($5.00)");
//                System.out.println("3. Large ($5.50)");

//                switch
//
//                System.out.println("Choose a flavor:");
//                System.out.println("1. Caramel");
//                System.out.println("2. Vanilla");
//                System.out.println("3. White Chocolate");
//                System.out.println("4. Mocha");
//                System.out.println("5. Masapan (+0.50)");
//                System.out.println("6. Horchata (+0.50)");
//                String orderChoice = Scanner.nextLine();
                }
            }
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
