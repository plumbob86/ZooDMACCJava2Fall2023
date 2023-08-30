/**
 * @author TrevorDickey - tjdickey
 * CIS175 - Fall 2023
 * Aug 29, 2023
 */
package model;

/**
 * 
 */
public class Penguin {
	// Instance variables representing the species, habitat, and height of the Penguin
	private String species;
	private String habitat;
	private int height; //in centimeters
	
	public Penguin() {
		super();
	}
	
	public Penguin(String species, String habitat, int height) {
		super();
		this.species = species;
		this.habitat = habitat;
		this.height = height;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Penguin [species=" + species + ", habitat=" + habitat + ", height=" + height + " centimeters]";
	}
	
	public String makeNoise() {
		return "The " + species + " Penguin says Honk!";}
}
