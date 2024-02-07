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
	private boolean nocturnal;
	
	public Animal(String type, int age, String species, String name, boolean flying, boolean aquatic, boolean predator, boolean nocturnal) {
		super(name, age);
		this.species = species;
		this.name = name;
		this.flying = flying;
		this.aquatic = aquatic;
		this.predator = predator;
		this.nocturnal = nocturnal; //Added for nocturnal animals
	}

	public String getSpecies() {
		return this.species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFlying() {
		return this.flying;
	}

	public boolean getFlying() {
		return this.flying;
	}

	public void setFlying(boolean flying) {
		this.flying = flying;
	}

	public boolean isAquatic() {
		return this.aquatic;
	}

	public boolean getAquatic() {
		return this.aquatic;
	}

	public void setAquatic(boolean aquatic) {
		this.aquatic = aquatic;
	}

	public boolean isPredator() {
		return this.predator;
	}

	public boolean getPredator() {
		return this.predator;
	}

	public void setPredator(boolean predator) {
		this.predator = predator;
	}

	public boolean isNocturnal() {
		return this.nocturnal;
	}

	public boolean getNocturnal() {
		return this.nocturnal;
	}

	public void setNocturnal(boolean nocturnal) {
		this.nocturnal = nocturnal;
	}
	
}