package com.cafecatrina;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReceiptWriter {
    public static void writeToFile(ArrayList<MenuItem> order) throws IOException {

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");

        File file = new File("receipts/" + formatter.format(dateTime) + ".txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (MenuItem item : order) {
                if (item instanceof Coffee coffee) {
                    bw.write(coffee.getSize() + " " + coffee.getName() + " " + String.format("$%.2f", coffee.getPrice())+ "\n");

                } else if (item instanceof HotChocolate hotChocolate) {
                    bw.write(hotChocolate.getName());
                    if (hotChocolate.isWhippedCream()) {
                        bw.write(" with Whipped Cream");
                    } else {
                        bw.write(" No Whipped Cream");
                    }
                    bw.write(" " + String.format("$%.2f", hotChocolate.getPrice())+ "\n");
                } else if (item instanceof PanDulce panDulce) {
                    bw.write(panDulce.getName());
                    if (panDulce.isWarmedUp()) {
                        bw.write(" with Warmed Up");
                    } else {
                        bw.write(" Not Warmed Up");
                    }
                    bw.write(" " + String.format("$%.2f", panDulce.getPrice())+ "\n");

                }
            }
        }
    }
}
