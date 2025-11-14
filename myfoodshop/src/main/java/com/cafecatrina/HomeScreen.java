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
                System.out.println("Please make your selection: ");
                System.out.println("o. Yes.");
                System.out.println("x. Exit");
                System.out.println("Enter a character here: ");
                String mainChoice = sc.nextLine();


                switch (mainChoice) {

                    case "o":
                        OrderScreen.startOrder();
                        break;


                    case "x":
                        System.out.println("Thank you, Goodbye!");
                        running = false;
                        break;


                }
            }
        }
    }

