package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Animal;
import entities.Entity;

public class Utils {

	ArrayList<Entity> entities = new ArrayList<Entity>();
	Set<String> uniqueSpecies = new HashSet<String>();

	public Utils() {

		try {
			String path = "src/res/Animals.csv";
			Scanner file = new Scanner(new File(path));

			while(file.hasNextLine()) {

				String[] row = file.nextLine().split(",");

				Animal a = new Animal(row[0], 
						Integer.parseInt(row[1]),
						row[2],
						row[3],
						Boolean.parseBoolean(row[4]),
						Boolean.parseBoolean(row[5]),
						Boolean.parseBoolean(row[6]));
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

	public void printSpecies() {

		for(String e : uniqueSpecies) {
			System.out.println(e);
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