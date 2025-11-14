package com.cafecatrina;
import java.util.ArrayList;
import java.util.Scanner;


public class CoffeeType {

    private static Scanner scanner = new Scanner(System.in);

    public static void show(ArrayList<CoffeeItems> OrderItems) {

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
                    System.out.println("Latte selected");
                    double lattePrice = chooseSize();
                    System.out.println("Total Latte Price: $" + lattePrice);
                    break;

                case "m":
                    System.out.println("Macchiato selected");
                    double macPrice = chooseSize();
                    System.out.println("Total Macchiato Price: $" + macPrice);
                    break;

                case "c":
                    System.out.println("Café de Olla selected");
                    double ollaPrice = chooseSize();
                    System.out.println("Total Café de Olla Price: $" + ollaPrice);
                    break;

                case "x":
                    running = false;
                    break;

                default:
                    System.out.println("Try again");
                    break;
            }
        }
    }

    private static double chooseSize() {
        System.out.println("1. Small  ($4.50)");
        System.out.println("2. Medium ($5.00)");
        System.out.println("3. Large  ($5.50)");
        System.out.print("Enter size: ");

        String sizeChoice = scanner.nextLine();

        switch (sizeChoice) {

            case "1":
                System.out.println("Size small selected.");
                return 4.50;

            case "2":
                System.out.println("Size medium selected.");
                return 5.00;

            case "3":
                System.out.println("Size large selected.");
                return 5.50;

            default:
                System.out.println("Invalid size, defaulting to Small.");
                return 4.50;
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
