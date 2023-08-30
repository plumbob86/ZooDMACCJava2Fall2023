
/**
*Brody Boell - bjboell1
*CIS171 22149
*Aug 30, 2023
*/
package model;

public class Bison {
	
	private String species;
	private int weight;
	private int age; 
	
	public Bison() {
		super();
	}
	public Bison(String species, int weight, int age) {
		super();
		this.species = species;
		this.weight = weight;
		this.age = age;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public String makeNoise() {
		return "bellowing";
	}
}
