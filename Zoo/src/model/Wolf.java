/**
 * @author Harry McVey
 * CIS175 - Fall 2023
 * Aug 29, 2023
 */


package model;

public class Wolf {

    private String furColor;
    private int age;
    private boolean isAlpha;

    public Wolf() {
        // Default constructor
    }

    public Wolf(String furColor, int age, boolean isAlpha) {
        this.furColor = furColor;
        this.age = age;
        this.isAlpha = isAlpha;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlpha() {
        return isAlpha;
    }

    public void setAlpha(boolean alpha) {
        isAlpha = alpha;
    }

    public String makeNoise() {
        return "HOWL!";
    }
    
    @Override
    public String toString() {
        return "Wolf [furColor=" + furColor + ", age=" + age + ", isAlpha=" + isAlpha + "]";
    }
}
