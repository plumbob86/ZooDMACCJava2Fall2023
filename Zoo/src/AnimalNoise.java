
import model.Example;
import model.Parrot;
import model.Dog;

public class AnimalNoise {

	public static void main(String[] args) {
		Example example = new Example();
		System.out.println(example.makeNoise());
		
		/*
		 * 
		 * Add a call to your animal below this comment.
		 */

		// Creating an instance of the Parrot class
		Parrot parrot = new Parrot("Green", "Amazon Parrot", 12);
		Dog dog = new Dog("Maltipoo", "Max", 12);
		// Printing the result of the makeNoise method from the Parrot class
		System.out.println(parrot.makeNoise());
		System.out.println(dog.bark());
	}

}
