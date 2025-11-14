package com.cafecatrina;
impo
import java.util.ArrayList;

public class ReceiptWriter {
    public static void writeToFile (ArrayList<MenuItem>order) {
        for (MenuItem item : order) {
            if (item instanceof Coffee coffee) {
                System.out.println(coffee.getSize() + " " + coffee.getName() + " " + String.format("$%.2f", coffee.getPrice()));

            }
            else if (item instanceof HotChocolate hotChocolate) {
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
                System.out.print(panDulce.getName());
                if (panDulce.isWarmedUp()) {
                    System.out.println(" with Warmed Up");
                }
                else {
                    System.out.println(" Not Warmed Up");
                }
                System.out.println(" " + String.format("$%.2f", panDulce.getPrice()));

            }
        }
    }
}
