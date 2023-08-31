/**
 * Aaliyah Trotter - atrotter1
 * CIS175 - Fall 2023
 * Aug 30, 2023
 */
package model;

public class Elephant {
	
	private int age;  //Adult, Baby, Adolescents
	private String name; // Name of elephant
	private String tusk; //Tusks or no Tusk
	
	
	public Elephant() {
		super();
	}
	
	
	public Elephant(int age, String name, String tusk) {
		super();
		this.age = age;
		this.name = name;
		this.tusk = tusk;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTusk() {
		return tusk;
	}

	
	public void setTusk(String tusk) {
		this.tusk = tusk;
	}


	@Override
	public String toString() {
		return "Elephant [age=" + age + ", name=" + name + ", tusk=" + tusk + "]";
	}
	
	public String makeNoise(){
		return "PAWOOO!";
		
	}
	
	
}
