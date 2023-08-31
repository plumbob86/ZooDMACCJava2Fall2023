/**
 * @author Alec Smith - ajsmith44
 * CIS175 - Fall 2023
 * Aug 30, 2023
 */

package model;

public class Sloth {
    
	private String relaxed; 
	private String color; 
	private int age;

    //Default constructor:
	public Sloth() {
		super();
	}
	public Sloth(String relaxed, String color, int age) {
		super();
		this.relaxed = relaxed;
		this.color = color;
		this.age = age;
	}

	public String getRelaxed() {
		return relaxed;
	}

	public void setRelaxed(String relaxed) {
		this.relaxed = relaxed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		
		return "Lion [color= " + color + ", relaxed= " + relaxed + ", age= " + age + " Years. ]";
	}

	public String makeNoise() {
		return "Yawn";
	}
}