/*
@author: Pnntn
@Date: 05/02/2024
@Description: Class that provide Animals to the ecosystem.
*/

package entities;

public class Animal extends Entity{

	private String species;
	private String name;
	private boolean flying;
	private boolean aquatic;
	private boolean predator;
	
	public Animal(String type, int age, String species, String name, boolean flying, boolean aquatic, boolean predator) {
		super(name, age);
		this.species = species;
		this.name = name;
		this.flying = flying;
		this.aquatic = aquatic;
		this.predator = predator;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFlying() {
		return flying;
	}
	public void setFlying(boolean flying) {
		this.flying = flying;
	}
	public boolean isAquatic() {
		return aquatic;
	}
	public void setAquatic(boolean aquatic) {
		this.aquatic = aquatic;
	}
	public boolean isPredator() {
		return predator;
	}
	public void setPredator(boolean predator) {
		this.predator = predator;
	}
	
}