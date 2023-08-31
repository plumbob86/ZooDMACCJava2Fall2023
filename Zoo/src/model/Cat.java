package model;

public class Cat {
	private Integer age;
	private String name;
	private String breed;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param age
	 * @param name
	 * @param length
	 */
	public Cat(Integer age, String name, String breed) {
		super();
		this.age = age;
		this.name = name;
		this.breed = breed;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setLength(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cat [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}

	public String makeNoise() {
		return "Meow!";
	}
}
