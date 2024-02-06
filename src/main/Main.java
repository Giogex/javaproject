/*
@author: Pnntn
@Date: 05/02/2024
@Description: Main class of the ecosystem.
*/

package main;

import java.util.Scanner;

import utils.Map;
import utils.Utils;

public class Main {

	public static void main(String[] args) {

		//		 int random;
		//		 
		//		 for( int i = 0; i<100; i++) {
		//			 
		//			 random = (int) (Math.random() * 100);
		//			 System.out.println(random);
		//		 }
		//		 

		Scanner input = new Scanner(System.in);
		
		Map m = null;

		Utils u = new Utils();
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
					u.printSpecies();
					break;

				case "2":
					u.prey();
					break;

				case "3":
					u.predator();
					break;

				case "4":
					u.printFamilies();
					break;
				
				case "5":
				if (m == null) {
					m = new Map();
					m.setVisible(true);
				}
				else if(!m.isVisible() && choice.equals("5")){
					m.setVisible(true);
				}
					break;

				case "0":
				if (m != null && m.isVisible()) {
					m.dispose();
					m = null;
				}
					break Menu;
				default:
					System.out.println("Scelta non valida");
				}
			} while(!choice.equals("0"));

		
		input.close();
	}
}