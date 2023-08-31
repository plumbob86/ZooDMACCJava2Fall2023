package model;

/**
 * @author Trevor Long - tlong5
 * CIS 175 - Fall 2023
 * Aug 30, 2023
 */

public class Badger {
	private String length;
	private double weight;
	private String gender;
	private String habitatType;

	/**
	 * 
	 */
	public Badger() {
		super();
	}

	/**
	 * @param length
	 * @param weight
	 * @param gender
	 * @param habitatType
	 */
	public Badger(String length, double weight, String gender, String habitatType) {
		super();
		this.length = length;
		this.weight = weight;
		this.gender = gender;
		this.habitatType = habitatType;
	}

	/**
	 * @return the length
	 */
	public String getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(String length) {
		this.length = length;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
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
	 * @return the habitatType
	 */
	public String getHabitatType() {
		return habitatType;
	}

	/**
	 * @param habitatType the habitatType to set
	 */
	public void setHabitatType(String habitatType) {
		this.habitatType = habitatType;
	}

	@Override
	public String toString() {
		return "Badger [length=" + length + ", weight=" + weight + ", gender=" + gender + ", habitatType=" + habitatType
				+ "]";
	}

	public String makeNoise() {
		return "RRRRRRRRR SSSSSSSSSSS";
	}
}
