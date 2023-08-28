
import model.Example;
import model.Parrot;
import model.Cat;
import model.Dog;
import model.Frog;

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
		
		// Creating an instance of the Cat class
		Cat cat = new Cat("Brown", "Tabby", 15.5);
		
		// Creating an instance of the Dog class
		Dog dog = new Dog("Black", "Black Lab", 60.4);
		
		// Creating an instance of the Frog class
		Frog frog = new Frog("Green", "West African Goliath Frog", 7);
		
		// Printing the result of the makeNoise method from the Parrot class
		System.out.println(parrot.makeNoise());
		
		// Printing the result of the makeNoise method from the Cat class
		System.out.println(cat.makeNoise());
		
		// Printing the result of the makeNoise method from the Dog class
		System.out.println(dog.makeNoise());
		
		// Printing the result of the makeNoise method from the Frog class
		System.out.println(frog.makeNoise());
	}

}
