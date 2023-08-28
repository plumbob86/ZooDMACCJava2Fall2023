package model;

public class Dog {
    private String breed;

	public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
	private int age;

    public Dog() {
        super();
    }

    public Dog(String breed, String name, int age) {
        super();
        setBreed(breed);
        setName(name);
        setAge(age);
    }

    public String bark() {
        return "Woof!";
    }
}