package utils;

import entities.Animal;
import entities.Entity;
import entities.Plant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Utils {

    ArrayList<Entity> entities = new ArrayList<Entity>();
    Set<String> uniqueSpecies = new HashSet<String>();
    Set<String> uniqueFamily = new HashSet<String>();

    public Utils() {
        animalData();
        plantsData();
    }

    private void animalData(){
        try (Scanner file = new Scanner(new File("src/res/Animals.csv"))) {
            while(file.hasNextLine()) {
                String[] row = file.nextLine().split(",");
                Animal a = new Animal(row[0],
                        Integer.parseInt(row[1]),
                        row[2],
                        row[3],
                        Boolean.parseBoolean(row[4]),
                        Boolean.parseBoolean(row[5]),
                        Boolean.parseBoolean(row[6]),
                        Boolean.parseBoolean(row[7]));
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

    private void plantsData(){
        try (Scanner file = new Scanner(new File("src/res/Plants.csv"))){
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