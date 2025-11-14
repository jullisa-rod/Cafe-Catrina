package com.cafecatrina;


import static com.cafecatrina.Main.simulateLoading;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderScreen {


    private static Scanner sc = new Scanner(System.in);

    public static void startOrder() {

        boolean ordering = true;


        while (ordering) {
            System.out.println("\nPlease make your first selection ");
            System.out.println("c. Add Coffee");
            System.out.println("hc. Add Hot Chocolate");
            System.out.println("p. Add Pan Dulce");
            System.out.println("x. Checkout");
            System.out.print("choice: ");

            String choice = sc.nextLine().trim().toLowerCase();

            switch (choice) {

                case "c":
                    handleCoffee();
                    break;

                case "hc":
                    System.out.println("Added Hot Chocolate!");
                    break;

                case "p":
                    System.out.println("Added Pan Dulce!");
                    break;

                case "x":
                    System.out.println("Checking out...");
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
    private static void handleCoffee() {

        ArrayList<String> coffeeChosen = new ArrayList<>();
        boolean choosing = true;


            while (choosing) {

                System.out.println("\nChoose your Coffee Option:");
                System.out.println("l. Latte");
                System.out.println("m. Macchiato");
                System.out.println("o. Café de Olla");
                System.out.println("finished choosing");

                System.out.println("Choice:");
                String coffeeChoice = sc.nextLine().trim().toLowerCase();


                double latteCost = 0;
                //boolean choosingCoffee = true;
                //ArrayList<String> coffeeChosen = new ArrayList<>();

                switch (coffeeChoice) {


                    case "l":
                        coffeeChosen.add("Latte");
                        System.out.println("Latte added.");
                        break;

                    case "m":
                        coffeeChosen.add("Macchiato");
                        System.out.println("Macchiato added.");
                        break;

                    case "o":
                        coffeeChosen.add("Café de Olla");
                        System.out.println("Café de Olla added.");
                        break;

                    default:
                        System.out.println("Invalid option.");


                    //switch (coffeeChoice) {
                        //case ("l"):
                            //latteCost += 4.00;
                           // coffeeChosen.add("Latte");
                            //break;

            }
        }
        System.out.println("You Selected: " + coffeeChosen);
    }
}
