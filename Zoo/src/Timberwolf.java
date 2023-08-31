
/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Aug 30, 2023
 */


public class Timberwolf {
	
	private String color;
	private int age;
	private String sex;
	
	Timberwolf(String color_, int age_, String sex_){
		setColor(color_);
		setAge(age_);
		setSex(sex_);
	}
	
	public Timberwolf(){
		
		
	}
	
	
	public String makeNoise() {
		return "Ow Ow Owooooooooooo";
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
