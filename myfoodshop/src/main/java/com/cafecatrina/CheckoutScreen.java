package com.cafecatrina;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckoutScreen {
    public static void startCheckout(ArrayList<MenuItem>order, Scanner sc) {
        System.out.println("Your Receipt:");
        double totalPrice = 0;
        for (MenuItem item : order) {
            if (item instanceof Coffee coffee) {
                totalPrice += coffee.getPrice();
                System.out.println(coffee.getSize() + " " + coffee.getName() + " " + String.format("$%.2f", coffee.getPrice()));

            }
            else if (item instanceof HotChocolate hotChocolate) {
                totalPrice += hotChocolate.getPrice();
                System.out.print(hotChocolate.getName());
                if (hotChocolate.isWhippedCream()) {

                    System.out.print(" with Whipped Cream");
                }
                else {
                    System.out.print(" No Whipped Cream");
                }
                System.out.println(" " + String.format("$%.2f", hotChocolate.getPrice()));
            }
            else if (item instanceof PanDulce panDulce) {
                totalPrice += panDulce.getPrice();
                System.out.print(panDulce.getName());
                if (panDulce.isWarmedUp()) {
                    System.out.print(" with Warmed Up");
                }
                else {
                    System.out.print(" Not Warmed Up");
                }
                System.out.println(" " + String.format("$%.2f", panDulce.getPrice()));

            }
        }
        System.out.printf("Total:$%.2f \n", totalPrice);
        System.out.println("Would you like you confirm or cancel your order?");
        System.out.print("Enter y or n : ");
        String input = sc.nextLine().toLowerCase();

        switch (input) {
            case "y":
                System.out.println("Printing receipt to file");
                try {
                    ReceiptWriter.writeToFile(order);
                } catch (IOException e) {
                    System.out.println("Something went wrong when writing the receipt");
                }
                break;

            case "n":
                System.out.println("Canceling previous order");
                break;
        }


    }
}
