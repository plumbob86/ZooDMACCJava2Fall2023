package model;

/**
 * @author torirem - aaustin5
 * CIS175 - Fall 2023
 * Aug 29, 2023
 */
public class Bongo {
	private String range;
	private String sex;
	private float weight;
	
	public Bongo() {
		super();
	}
	
	public Bongo(String range, String sex, float weight) {
		this.range = range;
		this.sex = sex;
		this.weight = weight;
	}

	/**
	 * @return the range
	 */
	public String getRange() {
		return range;
	}

	/**
	 * @param range the range to set
	 */
	public void setRange(String range) {
		this.range = range;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Bongo [range=" + range + ", sex=" + sex + ", weight=" + weight + "]";
	}
	
	public String makeNoise() {
		return "Snort!";
	}
}
