/**
 * @author yunyu - yyu3@dmacc.edu
 * CIS175 - Fall 2021
 * Sep 16, 2023
 */
package model;

//I call this class Tuxedo just because my husband has a cat who is named Tuxedo

public class Tuxedo {
	
	private String name;
	private String habitat;
	private Integer weight;
	
	public Tuxedo(String name, String habitat, int weight) {
		super();	
		this.name = name;
		this.habitat = habitat;
		this.weight = weight;
	}
	
	
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	public String toString() {
		
		return "Name: " + name + ", likes living on " + habitat + ", and its weight is " + weight + " pounds.";
	}
	
	public String makeNoise() {
		return "Give me canned food! Right now!";
	}
}
