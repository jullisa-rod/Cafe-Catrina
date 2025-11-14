package com.cafecatrina;


import static com.cafecatrina.Main.simulateLoading;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderScreen {
    private static Scanner scanner = new Scanner(System.in);

    public static void startOrder() {
        Scanner sc = new Scanner(System.in);
        boolean running = true;


        while (running) {
            System.out.println("Please make your first selection ");
            System.out.println("c. Add Coffee");
            System.out.println("hc. Add Hot Chocolate");
            System.out.println("p. Add Pan Dulce");
            System.out.println("x. Checkout");
            System.out.print("Please make your selection: ");
            String orderChoice = sc.nextLine();


            boolean coffeechoice = true;
            while (coffeechoice) {

                System.out.println("Choose your Coffee Option:");
                System.out.println("l. Latte");
                System.out.println("m. Macchiato");
                System.out.println("c. Café de Olla");
                System.out.println("done choosing");
                double latteCost = 0;
                boolean choosingCoffee = true;
                ArrayList<String> coffeeChosen = new ArrayList<>();

                while (choosingCoffee) {
                    System.out.println("choice");
                    String coffeeChoice = scanner.nextLine();

                    switch (coffeeChoice) {
                        case ("l"):
                            latteCost += 4.00;
                            coffeeChosen.add("Latte");
                            break;


                    }
                }

            }
        }
    }
}
