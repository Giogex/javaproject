/*
@author: Pnntn, Giogex
@Date: 05/02/2024
@Description: Utility class for the ecosystem.
*/

package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.*;

public class Utils {

	ArrayList<Entity> entities = new ArrayList<Entity>();
	Set<String> uniqueSpecies = new HashSet<String>();
	Set<String> uniqueFamily = new HashSet<String>(); //Added For Plants Update - Giogex - 05/02/2023

	public Utils() { //Modified for plant update now for every new .csv file a new method call can be added here - Giogex - 05/02/2023
		animalData();
		plantsData();
	}
	private void animalData(){ //New method for printing animals information - Giogex - 05/02/2023
		try (Scanner file = new Scanner(new File("src/res/Animals.csv"))) { //Modified for KI 1 - Giogex -  05/02/2024
			while(file.hasNextLine()) {
				String[] row = file.nextLine().split(",");
				Animal a = new Animal(row[0], 
						Integer.parseInt(row[1]),
						row[2],
						row[3],
						Boolean.parseBoolean(row[4]),
						Boolean.parseBoolean(row[5]),
						Boolean.parseBoolean(row[6]),
						Boolean.parseBoolean(row[7])); //added for nocturnal animals
				entities.add(a);
				uniqueSpecies.add(a.getSpecies());
			}
		}		
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(Exception e){ 	
			System.out.println(e);
		}
	}

	private void plantsData(){ //new method for printing plants information - Giogex - 05/02/2023
		try (Scanner file = new Scanner(new File("src/res/Plants.csv"))){ //Modified for KI 1 - Giogex -05/02/2024
			while(file.hasNextLine()){
				String[] row = file.nextLine().split(",");
				Plant p = new Plant(row[0],
						row[1],
						row[2],
						Boolean.valueOf(row[3]),
						Integer.valueOf(row[4]));
						entities.add(p);
						uniqueFamily.add(p.getFamily());
			}
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	public void printSpecies() {

		for(String e : uniqueSpecies) {
			System.out.println(e);
		}
	}

	public void printFamilies() {
        for (String family : uniqueFamily) {
            System.out.println(family);
        }
    }

	public void predator() {

		for(Entity e : entities) {

			if(e instanceof Animal && ((Animal) e).isPredator()) {

				Animal a = (Animal)e;

				System.out.println("Specie: " + a.getSpecies()
				+ "\nNome: " + a.getName()
				+ "\nEtà: " + a.getAge()
				+ "\nAcquatico: " + (a.isAquatic() ? "Si" : "No")
				+ "\nVolante: " + (a.isFlying() ? "Si" : "No") + "\n");
			}
		}	
	}

	public void prey() {

		for(Entity e : entities) {

			if(e instanceof Animal && !((Animal) e).isPredator()) {

				Animal a = (Animal)e;

				System.out.println("Specie: " + a.getSpecies()
				+ "\nNome: " + a.getName()
				+ "\nEtà: " + a.getAge()
				+ "\nAcquatico: " + (a.isAquatic() ? "Si" : "No")
				+ "\nVolante: " + (a.isFlying() ? "Si" : "No") + "\n");
			}
		}	
	}
}