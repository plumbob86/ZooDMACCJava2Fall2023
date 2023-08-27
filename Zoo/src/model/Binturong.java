/**
 * @author chris - chtutje@dmacc.edu
 * CIS175 - Fall 2023
 * Aug 27, 2023
 */

package model;

public class Binturong {
    private String sex;
    private int age;
    private String furColor;

    public Binturong(String sex, int age, String furColor) {
        this.sex = sex;
        this.age = age;
        this.furColor = furColor;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String speak() {
        return "Salutations, I'm an arboreal herbivore from southeast Asia, and I smell like popcorn. SCREOW!";
    }
}
