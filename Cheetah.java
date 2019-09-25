//Cheetah child class of Cat parent class
public class Cheetah extends Cat {
	
	/*creating any Cheetah object would include this, written so that these values has to be set. */
	public Cheetah(String name, String gender, int age, int whiskers) {
		super(name, gender, age, whiskers);		//.this setters taken from super class Cat
	}
	
	/*I have created a enum class Food to store Food constants. Here I am calling meat and grass and 
	 * setting what the cheetahs eat.*/
	@Override
	public void eats() {
		System.out.println("The cheetahs eat "+ Food.meat + " and " + Food.grass + ".");
	}
	
	/*abstracted from Animal parent class
	 * Parameters: Animal object. I want the Cheetah object executing this method to be able to interact with 
	 * another Animal object and their traits. Object name, nimble, represents to me that i've written this
	 * exclusively for the Cheetah class. This method is a bit different... I'm not letting the Human objects
	 * interact with this method. I haven't imported a Human object into the parameters, so I can't use 
	 * guide1.speak(""); here. This method plays out an entire scene. Everything needed for the Cheetah part of
	 * the program has ultimately been put in this one method.
	 * In this method, I get the speed of the object and have it execute other methods if the speed > 110km/h*/
	@Override
	public void topViewSpeed(Animal nimble) {
		System.out.println("If you look down here, you will see " + getName() + " running at what seems to be "
				+ getCurrSpeed() + "km/h. \n");
		System.out.println(nimble.getName() + " likes to challenge fellow coalition members, like " + getName()
				+ " to a race when \n" + "they surpass a certain speed. \n");

		if (nimble.getSpeed() > 110) {
			chase(nimble);					//chase() called from parent class Cat
			System.out.println(" ");
			eats();							//eats() called from Cheetah class
			hungerReaction();				//hungerReaction() called from parent class Animal
			nimble.hungerReaction();		//hungerReaction() called from parent class Animal
		} else {
			System.out.println("Looks like " + nimble.getName() + " doesn't see " + getName()
					+ " as a reasonable challenge today. Let's see how hungry they are! \n");
			eats();							//eats() called from Cheetah class
			hungerReaction();				//hungerReaction() called from parent class Animal
			nimble.hungerReaction();		//hungerReaction() called from parent class Animal
		}
	}
}
