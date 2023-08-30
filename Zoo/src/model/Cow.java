package model;

public class Cow {
	private String color;
	private int age;
	private String name;
	public Cow(String color, int age, String name) {
		super();
		this.color = color;
		this.age = age;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Cow [color=" + color + ", age=" + age + ", and my is name " + name + "]";
	}
	public String makeNoise() {
		return "MOOOOOooOOOOoo";
	}
}
