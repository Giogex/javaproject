/*
@author: Giogex
@Date: 05/02/2024
@Description: Class that provide Plants to the ecosystem.
*/

package entities;

public class Plant extends Entity{
	private String type;
    private String family;
    private String name;
    private boolean carnivorous;

    public Plant(String type, String name, String family, boolean carnivorous, int age){
        super(name, age);
        this.type = type;
        this.name = name;
        this.family = family;
        this.carnivorous = carnivorous;
        this.age = age;

}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFamily() {
		return this.family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCarnivorous() {
		return this.carnivorous;
	}

	public boolean getCarnivorous() {
		return this.carnivorous;
	}

	public void setCarnivorous(boolean carnivorous) {
		this.carnivorous = carnivorous;
	}

}