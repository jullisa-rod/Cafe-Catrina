package com.cafecatrina;

import java.util.Scanner;

public class OrderScreen {
    public static void showOrderScreen() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;


        while (running) {
            System.out.println("Please make your first selection ");
            System.out.println("c. Coffee");
            System.out.println("hc. Hot Chocolate");
            System.out.println("p. Pastry");
            System.out.println("x. exit");
            System.out.print("Please make your selection: ");
            String orderChoice = scanner.nextLine();
//            scanner.nextLine();


            switch (orderChoice){
                case "c":

                case "hc":

                case "p":

                case "x":
                   return;
            }

        }
    }


}
