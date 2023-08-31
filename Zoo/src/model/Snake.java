package model;


public class Snake {

	private int length;
	private String habitat;
	
	public Snake() {
		super();
		
	}
	public Snake(int length, String habitat) {
		super();
		this.length = length;
		this.habitat = habitat;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	@Override
	public String toString() {
		return "Snake [length=" + length + ", habitat=" + habitat + "]";
	}
	
}
