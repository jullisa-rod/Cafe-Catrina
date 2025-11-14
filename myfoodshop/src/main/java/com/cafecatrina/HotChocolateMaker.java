package com.cafecatrina;

import java.util.Scanner;

public class HotChocolateMaker {
    private static Scanner scanner = new Scanner(System.in);
    public static HotChocolate makeHotChocolate() {
        System.out.println("Choose your Hot Chocolate!");
        String name = getName();
        boolean whippedCream = getWhippedCream();
        double price;
        if (whippedCream == true) {
            price = 4.50;
        }
        else {
            price = 4.00;
        }
        HotChocolate hotChocolate = new HotChocolate(name, whippedCream, price);
        return hotChocolate;
    }
    private static String getName() {

        boolean running = true;
        String name = "";

        while (running) {
            System.out.println("Choose your Hot Chocolate Option:");
            System.out.println("a. Abuelita");
            System.out.println("m. Masapan");
            System.out.println("b. Belgian");
            System.out.print("Enter a character here: ");

            String hotChocoType = scanner.nextLine().toLowerCase();

            switch (hotChocoType) {

                case "a":
                    name = "Abuelita";
                    running = false;
                    break;

                case "m":
                    name = "Masapan";
                    running = false;
                    break;

                case "b":
                    name = "Belgian";
                    running = false;
                    break;

                default:
                    System.out.println("Try again");
                    break;
            }
        }
        return name;
    }

    private static boolean getWhippedCream() {
        System.out.println("would you like to add whipped cream for an extra ($.50)?");
        System.out.print("Enter y or n : ");

        String sizeChoice = scanner.nextLine();

        switch (sizeChoice) {

            case "y":
                System.out.println("Extra Whip");
                return true;

            case "n":
                System.out.println("No Whip");
                return false;

            default:
                System.out.println("Invalid, defaulting to No Whip.");
                return false;
        }
    }
}
