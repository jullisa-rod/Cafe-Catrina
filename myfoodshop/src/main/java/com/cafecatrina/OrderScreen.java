package com.cafecatrina;


import static com.cafecatrina.Main.simulateLoading;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderScreen {


    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<MenuItem> order;

    public static void startOrder() {

        boolean ordering = true;
        order = new ArrayList<>();

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
                    Coffee coffee = CoffeeMaker.makeCoffee();
                    order.add(coffee);
                    break;

                case "hc":
                    HotChocolate hotChocolate = HotChocolateMaker.makeHotChocolate();
                    order.add(hotChocolate);
                    break;

                case "p":
                    PanDulce panDulce = PanDulceMaker.makePanDulce();
                    order.add(panDulce);
                    break;

                case "x":
                    System.out.println("Checking out...");
                    CheckoutScreen.startCheckout(order, sc);
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

}
