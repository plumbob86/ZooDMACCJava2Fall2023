
import model.Example;
import model.Lion;
import model.Parrot;
import model.Binturong;
import model.Penguin;

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

		//instantiating the binturong
		Binturong binturong = new Binturong("male", 25, "Black");
		
		// Printing the result of the makeNoise method from the Parrot class
		System.out.println(parrot.makeNoise());


		//binturong go moo 
		System.out.println(binturong.speak());

		//New instance of Lion class
		Lion myLion = new Lion("Adult", "Male", 200);

		//Making noise:
		System.out.println(myLion.makeNoise());
		
		// New instance of Penguin class
		Penguin myPenguin = new Penguin("Emperor", "Antartic Peninsula", 115);
		
		//Making Noises
		System.out.println(myPenguin.makeNoise());

	}

}
