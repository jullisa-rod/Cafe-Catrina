package com.cafecatrina;
import static com.cafecatrina.Main.simulateLoading;
import java.util.Scanner;

public class OrderScreen {
    public static void showOrderScreen() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;


        while (running) {
            System.out.println("Please make your first selection ");
            System.out.println("c. Coffee");
            System.out.println("hc. Hot Chocolate");
            System.out.println("p. Pan Dulce");
            System.out.println("x. exit");
            System.out.print("Please make your selection: ");
            String orderChoice = scanner.nextLine();
//            scanner.nextLine();


            switch (orderChoice){
                case "c":
                    Scanner scanner = new Scanner(System.in);
                    boolean coffeechoice = true;


                    while (coffeechoice) {
                        System.out.println("Choose your Coffee Option:");
                        System.out.println("l. Latte");
                        System.out.println("m. Macchiato");
                        System.out.println("c. Café de Olla");
                        System.out.println("Return to Main Order Menu:");
                        String coffeeType = scanner.nextLine();

                        switch (coffeeType) {
                            case "l":
                                //Latte.showLatte();
                                break;

                            case "m":
                                Macchiato.showMacchiato();
                                break;

                            case "c":
                                CafeDeOlla.showCafeDeOlla();
                                break;

                            case "x":
                                return;
                        }



                    }
                    break;

                case "hc":
                    HotChocolate.showHotChocolate();
                    break;

                case "p":
                    PanDulce.showPanDulce();
                    break;

                case "x":
                   return;
            }

        }
    }


}
