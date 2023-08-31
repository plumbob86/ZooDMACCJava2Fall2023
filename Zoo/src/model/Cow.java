/**
 * @author Michael Sedykh - masedykh
 * CIS175 - Fall 2023
 * Aug 30, 2023
 */


package model;

public class Lion {
    
	private String lifeStage; //adult, infant, cowling
	private String gender; //male, female, intersex
	private int weight; //in kilograms

    //Default constructor:
	public Cow() {
		super();
	}

	/**
	 * @param lifeStage
	 * @param gender
	 * @param weight
	 */
	public Lion(String lifeStage, String gender, int weight) {
		super();
		this.lifeStage = lifeStage;
		this.gender = gender;
		this.weight = weight;
	}

	/**
	 * @return the lifeStage
	 */
	public String getLifeStage() {
		return lifeStage;
	}

	/**
	 * @param lifeStage the lifeStage to set
	 */
	public void setLifeStage(String lifeStage) {
		this.lifeStage = lifeStage;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	// Overrides toString method to return a string representation of the Lion object
	@Override
	public String toString() {
		
		return "Cow [gender= " + gender + ", life stage = " + lifeStage + ", weight=" + weight + "kilograms. ]";
	}

    // Method to return the noise made by the Cow
	public String makeNoise() {
		return "MOOOOOOOOOOO!";
	}
}
