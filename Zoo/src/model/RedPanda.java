package model;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Aug 30, 2023
 */
public class RedPanda {

		private String gender; //male or female
		private int weight; //pounds
		private int age; // years
		
		//Default constructor
		public RedPanda() {
			super();
		}

		public RedPanda(String gender, int weight, int age) {
			super();
			this.gender = gender;
			this.weight = weight;
			this.age = age;
		}

		//Getters and Setters
		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
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
  
		@Override
		public String toString() {
			return "RedPanda [gender=" + gender + ", weight=" + weight + ", age=" + age + "]";
		}
		
		//returns animal noise!!
		public String speak() {
			//pronounced very squeaky : )
			return "feeeew";
		}
}
