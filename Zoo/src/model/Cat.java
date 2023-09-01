package model;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera CIS175 Fall 2023 Aug, 30
 */
public class Cat {

	private String name;
	private String age;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String makeNoise() {
		return "Meeeoowwww!";
	}
}
