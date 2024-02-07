package main;

import utils.Map;
import utils.Utils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Map map = null;
        Utils utils = new Utils();
        String choice;

        Menu:
        do {
            System.out.println("1. Specie\n"
                    + "2. Prede\n"
                    + "3. Predatori\n"
                    + "4. Piante\n"
                    + "5. Mostra Mappa (Finestra separata Highly Experimental!)\n"
                    + "0. Esci");

            choice = input.nextLine();

            switch(choice) {
                case "1":
                    utils.printSpecies();
                    break;

                case "2":
                    utils.prey();
                    break;

                case "3":
                    utils.predator();
                    break;

                case "4":
                    utils.printFamilies();
                    break;

                case "5":
                    if (map == null) {
                        map = new Map();
                        map.setVisible(true);
                    } else if (!map.isVisible() && choice.equals("5")) {
                        map.setVisible(true);
                    }
                    break;

                case "0":
                    if (map != null && map.isVisible()) {
                        map.dispose();
                        map = null;
                    }
                    break Menu;

                default:
                    System.out.println("Scelta non valida");
            }
        } while(!choice.equals("0"));

        input.close();
    }
}
