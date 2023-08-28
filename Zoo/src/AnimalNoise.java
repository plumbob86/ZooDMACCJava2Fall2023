
import model.Example;
import model.Parrot;
import model.Sloth;

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
		
		// Printing the result of the makeNoise method from the Parrot class
		System.out.println(parrot.makeNoise());
		
		//creating instance of Sloth object
		Sloth sloth = new Sloth("Three-toed Sloth", "Central and South America", 3);
		
		System.out.println(sloth.makeNoise());
		
		
	}

}
