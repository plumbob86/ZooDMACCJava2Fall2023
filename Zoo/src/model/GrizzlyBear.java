package model;

/**  
* @author Andrew May - agmay
* CIS175 - Fall 2023
* Aug 29, 2023
*/

public class GrizzlyBear {
	private String sex;
	private int weight; // in kilograms
	private String diet;
	
	public GrizzlyBear() {
		super();
		// TODO Auto-generated constructor stub
	}


	public GrizzlyBear(String sex, int weight, String diet) {
		super();
		this.sex = sex;
		this.weight = weight;
		this.diet = diet;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}


	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
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


	/**
	 * @return the diet
	 */
	public String getDiet() {
		return diet;
	}


	/**
	 * @param diet the diet to set
	 */
	public void setDiet(String diet) {
		this.diet = diet;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "GrizzlyBear [sex=" + sex + ", weight=" + weight + " kg, diet=" + diet + "]";
	}

	public String makeNoise() {
		return "RRROOAARR!";
	}
	
}
