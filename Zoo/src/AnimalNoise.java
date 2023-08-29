
import model.Example;
import model.Parrot;
import model.Bongo;

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
		// Creating an instance of the Bongo class
		Bongo bongo1 = new Bongo("Mountain", "Female", 415);
		
		// Printing the result of the makeNoise method from the Parrot class
		System.out.println(parrot.makeNoise());
		// Printing the result of the makeNoise method from the Bongo class
		System.out.println(bongo1.makeNoise());
	}

}
