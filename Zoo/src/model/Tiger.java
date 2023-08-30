package model;

public class Tiger {
	private String color;
	private int age;
	private String species;
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
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	@Override
	public String toString() {
		return "Tiger [color=" + color + ", age=" + age + ", species=" + species + "]";
	}
	public String makeNoise() {
		return "ROARRR!";
	}
}
