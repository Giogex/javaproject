package entities;

public class Plants extends Entity{
    private String family;
    private String name;
    private boolean carnivorous;

    public Plants(String type, int age, String name, String family, boolean carnivorous){
        super(name, age);
        this.type = type;
        this.name = name;
        this.family = family;
        this.carnivorous = carnivorous;
        this.age = age;

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