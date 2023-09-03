/**
 * Author: Hong Huynh - hmhuynh1@dmacc.edu
 * CIS 175 - FALL 2023
 * Sep 1, 2023
 */
	
package model;

public class Penguin {
	    
		private String type; //type of penguin-ex.king penguin
		private String gender; //male, female, intersex
		private int age; //age of penguin.

	    //Default constructor:
public Penguin() {
	super();
}

		/**
		 * @param lifeStage
		 * @param gender
		 * @param weight
		 */
		public Penguin (String type, String gender, int age) {
			super();
			this.type = type;
			this.gender = gender;
			this.age = age;
		}

		/**
		 * @return the lifeStage
		 */
		public String getType() {
			return type;
		}

		/**
		 * @param lifeStage the lifeStage to set
		 */
		public void setType(String type) {
			this.type = type;
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
		public int getAge() {
			return age;
		}

		/**
		 * @param weight the weight to set
		 */
		public void setAge(int age) {
			this.age = age;
		}

		// Overrides toString method to return a string representation of the pen object
		@Override
		public String toString() {
			
			return "Penguin [gender= " + gender + ", type = " + type + ", Age=" + age + "years old. ]";
		}

	    // Method to return the noise made by the Lion
		public String makeNoise() {
			return "squawk";
		}
	}