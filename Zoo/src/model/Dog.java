/**
 * @author Joshua Vestal-Bennett - javestalbennett
 * CIS175 - Fall 2023
 * Aug 28, 2023
*/
package model;

/**
 * 
 */
public class Dog 
{
	String color;
	String species;
	double weight;
	
	// Constructor
	public Dog(String color, String species, double weight)
	{
		this.color = color;
		this.species = species;
		this.weight = weight; // in pounds
	}
	
	public String makeNoise()
	{
		return "Bark";
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public String getSpecies()
	{
		return color;
	}
	
	public void setSpecies(String species)
	{
		this.species = species;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	@Override
	public String toString()
	{
		return "Dog [color=" + color + ", species=" + species + ", weight=" + weight + " pounds]";
	}
}
