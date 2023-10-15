package model;

public class Dog {
	private String breed;
	private int age;
	private String size;
	
	public Dog(String breed, int age, String size) {
		this.breed = breed;
		this.age = age;
		this.size = size;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", age=" + age + ", size=" + size + "]";
	}
	public String MakeNoise() {
		return "Bark!";
	}
}


