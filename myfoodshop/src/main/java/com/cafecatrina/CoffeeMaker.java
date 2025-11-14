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
        System.out.println("s. Small  ($4.50)");
        System.out.println("m. Medium ($5.00)");
        System.out.println("l. Large  ($5.50)");
        System.out.print("Enter size: ");

        String sizeChoice = scanner.nextLine().toLowerCase();

        switch (sizeChoice) {

            case "s":
                System.out.println("Size Small selected.");
                return "S";

            case "m":
                System.out.println("Size Medium selected.");
                return "M";

            case "l":
                System.out.println("Size Large selected.");
                return "L";

            default:
                System.out.println("Invalid size, defaulting to Small.");
                return "S";
        }
    }
}