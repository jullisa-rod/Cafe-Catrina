package com.cafecatrina;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPrice = 0.0;
        ArrayList<String> flavors = new ArrayList<>();
        ArrayList<String> extras = new ArrayList<>();

        System.out.println("Welcome to Café Catrina!");
        System.out.println("What would you like to order today?");
        System.out.println("1. Coffee");
        System.out.println("2. Hot Chocolate");
        System.out.println("3. Pastry");
        System.out.print("Please make your selection: ");
        int mainChoice = input.nextInt();
        input.nextLine(); // clear buffer


        switch (mainChoice) {
            case 1:
                // coffee options
                System.out.println("\nChoose your coffee type:");
                System.out.println("1. Café de Olla ");
                System.out.println("2. Latte ");
                System.out.println("3. Macchiato ");
                System.out.print("Please make your selection: ");
                int coffeeChoice = input.nextInt();
                input.nextLine();


                String coffeeName = switch (coffeeChoice) {
                    case 1 -> "Cafe de Olla";
                    case 2 -> "Latte";
                    case 3 -> "Macchiato";
                    default -> "Unknown Coffee";
                };

                System.out.println("\nPlease select a size:");
                System.out.println("1. Small($4.50");
                System.out.println("2. Medium ($5.00");
                System.out.println("3. Large ($5.50");
                System.out.println("Please make your selection:");
                int sizeChoice = input.nextInt();
                input.nextLine();


                switch (sizeChoice) {
                    case 1 -> totalPrice = 4.50;
                    case 2 -> totalPrice = 5.00;
                    case 3 -> totalPrice = 5.50;
                    default -> {
                        System.out.println("Invalid size!");
                        return;
                    }
                }

        }
    }
}

