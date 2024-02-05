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
		
		Map m = new Map();

		Utils u = new Utils();
		String choice;

		Menu:
			do {

				System.out.println("1. Specie\n"
						+ "2. Prede\n"
						+ "3. Predatori\n"
						+ "4. Piante\n"
						+ "5. Mapping\n"
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
					m.showMap();
					break;

				case "0":
					break Menu;
				default:
					System.out.println("Scelta non valida");
				}
			} while(true);

		
		input.close();
	}
}