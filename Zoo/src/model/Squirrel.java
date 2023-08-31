package model;

//added by Jenni

public class Squirrel {
	private String habitat;
	private String name;
	private int age;
	private String color;
	
	public Squirrel() {
		super();
	}
	public Squirrel(String habitat, String name, String color, int age) {
		super();
		this.habitat = habitat;
		this.color = color;
		this.name = name;
		this.age = age;
	}
	public int getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String species) {
		this.name = name;
	}	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Squirrel [habitat=" + habitat + "color=" + color + ", age=" + age + ", name=" + name + "]";
	}
	public String makeNoise() {
		return "Squeak Squeaker, Squeak Squeaken";
	}
}
