/**
 * @author Adam Reese - amreese3
 * CIS175 - Fall 2023
 * Aug 23, 2023
 */

package model;

public class Parrot {
	// Instance variables representing the color, species, and wingspan of the Parrot
	private String color;
	private String species;
	private int wingspan; // in inches

	// Default constructor
	public Parrot() {
		super();
	}

	// Parameterized constructor that accepts color, species, and wingspan
	public Parrot(String color, String species, int wingspan) {
		super();
		this.color = color;
		this.species = species;
		this.wingspan = wingspan;
	}

	// Getter method for color
	public String getColor() {
		return color;
	}

	// Setter method for color
	public void setColor(String color) {
		this.color = color;
	}

	// Getter method for species
	public String getSpecies() {
		return species;
	}

	// Setter method for species
	public void setSpecies(String species) {
		this.species = species;
	}

	// Getter method for wingspan
	public int getWingspan() {
		return wingspan;
	}

	// Setter method for wingspan
	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	// Overrides toString method to return a string representation of the Parrot object
	@Override
	public String toString() {
		return "Parrot [color=" + color + ", species=" + species + ", wingspan=" + wingspan + " inches]";
	}

	// Method to return the noise made by the Parrot
	public String makeNoise() {
		return "Squawk!";
	}
}
