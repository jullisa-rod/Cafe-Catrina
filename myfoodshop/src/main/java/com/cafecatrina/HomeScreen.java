package com.cafecatrina;

import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import static com.cafecatrina.Main.simulateLoading;


public class HomeScreen {


    public static void start() {
            Scanner sc = new Scanner(System.in);
            boolean running = true;

            System.out.println("Welcome to Café Catrina!");


            while (running) {
                System.out.println("Would you like to place an order today?");
                System.out.print("Please make your selection: ");
                System.out.println("o. Yes.");
                System.out.println("x. Exit");
                System.out.println("Enter a character here: ");
                String mainChoice = sc.nextLine();


                switch (mainChoice) {

                    case "o":
                        //OrderScreen.showOrderScreen();
                        break;
//

                    case "x":
                        System.out.println("Thank you, Goodbye!");
                        running = false;
                        break;


                }


                //switch (Choice) {
                //case "1":
                // coffee options
//                System.out.println("\nChoose your coffee type:");
//                System.out.println("1. Café de Olla ");
//                System.out.println("2. Latte ");
//                System.out.println("3. Macchiato ");
//                System.out.print("Please make your selection: ");
//                String coffeeChoice = sc.nextLine();
//                //sc.nextLine();
//
//
//                System.out.println("Choose size: small / medium / large");
//                String size = sc.nextLine();
//
//                // Flavor
//                System.out.println("Choose a flavor for your coffee:");
//                System.out.println("1. Caramel");
//                System.out.println("2. Vanilla");
//                System.out.println("3. White Chocolate");
//                System.out.println("4. Mocha");
//                System.out.println("5. Masapan (+0.50)");
//                System.out.println("6. Horchata (+0.50)");
//                String flavorChoice = sc.nextLine();


                // Flavor flavor = createFlavor(flavorChoice);


//            String coffeeName = switch (coffeeChoice) {
//                case 1 -> "Cafe de Olla";
//                case 2 -> "Latte";
//                case 3 -> "Macchiato";
//                default -> "Unknown Coffee";
//            };
//
//            System.out.println("\nPlease select a size:");
//            System.out.println("1. Small($4.50");
//            System.out.println("2. Medium ($5.00");
//            System.out.println("3. Large ($5.50");
//            System.out.println("Please make your selection:");
//            int sizeChoice = scanner.nextInt();
//            scanner.nextLine();
//
//
//            switch (sizeChoice) {
//                case 1 -> totalPrice = 4.50;
//                case 2 -> totalPrice = 5.00;
//                case 3 -> totalPrice = 5.50;
//                default -> {
//                    System.out.println("Invalid size!");
//                    return;
//                }
//            }
//            System.out.println("\nSelect your flavor (type 'done' when finished: ");
//            System.out.println("Caramel, vanilla, White Chocolate, Mocha, Masapan (+$0.50), Horchata (+$0.50)");
            }
        }
    }

