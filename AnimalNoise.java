//import model.Example;
import model.Lion;
import model.Parrot;
import model.Binturong;
import model.Tiger;

public class AnimalNoise {

	public static void main(String[] args) {
		//Example example = new Example();
		//System.out.println(example.makeNoise());
		
		/*
		 * 
		 * Add a call to your animal below this comment.
		 */

		// Creating an instance of the Parrot class
		Parrot parrot = new Parrot("Green", "Amazon Parrot", 12);

		// Printing the result of the makeNoise method from the Parrot class
		System.out.println(parrot.makeNoise());
		
		//instantiating the binturong
		Binturong binturong = new Binturong("male", 25, "Black");
		
		//binturong go moo 
		System.out.println(binturong.speak());

		//New instance of Lion class
		Lion Lion = new Lion("Adult", "Male", 200);

		//Making noise:
		System.out.println(Lion.makeNoise());
		
		//New instance of Lion class
		Tiger Tiger = new Tiger("Brown", 7,"Siberian Tiger");

		//Making noise:
		System.out.println(Tiger.makeNoise());

	}

}
