/**
 * 
 */
package model;

/**
 *  @author Amy Miles - almiles
 *  CIS175 Fall 2023
 *  Aug 27, 2023
 */
public class Sloth {
	
	private String name;
	private String habitat;
	private int age;
	/**
	 * Default
	 */
	public Sloth() {
		super();		
	}
	/**
	 * @param name
	 * @param habitat
	 * @param age
	 */
	public Sloth(String name, String habitat, int age) {
		super();
		this.name = name;
		this.habitat = habitat;
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
	 * @return the habitat
	 */
	public String getHabitat() {
		return habitat;
	}
	/**
	 * @param habitat the habitat to set
	 */
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Sloth [name=" + name + ", habitat=" + habitat + ", age=" + age + "]";
	}
	
	public String makeNoise() {
		return "peeeeeep!";
	}
	
	
}
