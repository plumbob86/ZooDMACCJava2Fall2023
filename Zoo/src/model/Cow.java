package model;

/**  
* Taylor Layton - tglayton
* CIS175
* Aug 28, 2023
* Windows 10 
*/

public class Cow
{
    private String habitat;
    private String name;
    private int weight;

    public Cow() 
    {
    }

    public Cow(String habitat, String name, int weight)
    {
        this.habitat = habitat;
        this.name = name;
        this.weight = weight;   
    }

    // Getters and Setters for habitat, name, and weight
    public String getHabitat()
    {
        return habitat;
    }

    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "Cow [name=" + name + ", weight=" + weight + " kg, habitat=" + habitat + "]";
    }

    public String makeNoise()
    {
        return "Moo!";
    }
}
