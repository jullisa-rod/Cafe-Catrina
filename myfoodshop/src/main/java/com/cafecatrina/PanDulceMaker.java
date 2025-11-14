package com.cafecatrina;

import java.util.Scanner;

public class PanDulceMaker {
    private static Scanner scanner = new Scanner(System.in);
    public static PanDulce makePanDulce() {
        System.out.println("Choose your Pan Dulce!");
        String name = getName();
        boolean warmedUp = getWarmedUp();
        double price = 2.00;

        PanDulce panDulce = new PanDulce(name, warmedUp, price);
        return panDulce;
    }
    private static String getName() {

        boolean running = true;
        String name = "";

        while (running) {
            System.out.println("Choose your Pan Dulce Option:");
            System.out.println("1. Concha ");
            System.out.println("2. Croissant");
            System.out.println("3. Mantecada");
            System.out.print("Enter a number here: ");

            String panDulceType = scanner.nextLine().toLowerCase();

            switch (panDulceType) {

                case "1":
                    name = "Concha";
                    running = false;
                    break;

                case "2":
                    name = "Croissant";
                    running = false;
                    break;

                case "3":
                    name = "Mantecada";
                    running = false;
                    break;

                default:
                    System.out.println("Try again");
                    break;
            }
        }
        return name;
    }

    private static boolean getWarmedUp() {
        System.out.println("would you like to have your item warmed up?");
        System.out.print("Enter y or n : ");

        String sizeChoice = scanner.nextLine();

        switch (sizeChoice) {

            case "y":
                System.out.println(" your item will be warmed up");
                return true;

            case "n":
                System.out.println("we will leave your item as is");
                return false;

            default:
                System.out.println("Invalid, defaulting to leaving it as is.");
                return false;
        }
    }
}
