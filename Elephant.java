import java.util.ArrayList;
import java.util.Scanner;

//Elephant child class of Animal parent class
public class Elephant extends Animal {

	private boolean who;
	
	/*creating any Lion object would include this, written so that these values has to be set. */
	public Elephant(String name, String gender, int age, boolean tusk) {
		super(name, gender, age);		//this. setters taken from super class Animal
		this.getTusk();					//Elephants, unlike the felines, have tusks. 
	}									//due to the ivory trade, we know that some elephants might not 
										//tusks, so I want a boolean value set when objects are created
	/*I have created a enum class Food to store Food constants. Here I am calling grass, carrots and marula
	 * and setting what the elephants eat.*/
	@Override
	public void eats() {
		System.out.println("The elephants eat  " + Food.grass + ", " + Food.carrots + " and a naughty " + Food.marula
				+ " every now and then.");
	}
	
	/*Parameters: Human object. I want a Human object to interact with this method.
	 * I use another scanner input to be able to use the value given by the user when using the if-else 
	 * statement. The user has to donate R10 to get some carrots and a marula fruit. If they donate more
	 * I want them to get another for every R5 they donate. I am relying on the JVM to round up or down, 
	 * I would like to figure out how to ask the user if they want their change rather than another marula
	 * and then give them their change, or let them buy more marulas, but give them change if they didn't 
	 * pay in 5s (5, 10, 15)  or if they would like change like R30 for carrots, a marula and 2  extra 
	 * marulas: R30 - R15 = R15 change || R27 for carrots, a marula and 1 extra marula: R27 - R10 = R17 change*/
	@Override
	public void feed(Human guide) {
		Scanner inputFeed = new Scanner(System.in);
		int feed = inputFeed.nextInt();
		System.out.println(" ");
		
		if (feed > 5) {					//what user paid > what user has to pay
			int marula = feed / 5;		//calculating how many marula fruits to give to the user
			guide.speak("Thank you for your kind donation. Here are some carrots to feed to our friends"
					+ " and your " + marula + " marula fruit.");
		} else if (feed == 5) {
			guide.speak("Thank you! Here are some carrots and a marula fruit to feed to our friends!");
		}
		else {
			guide.speak("Not interested today? That's okay! You can still pet the elephants, they are really playful!");
		}
	}

	/*In the main method, I ask the user if they would like to see some tricks from the elephant with tusks or the 
	 * elephant who doesn't have tusks. This method contains the scanner input and another operator to 
	 * turn the user's int input value into a boolean value. 1=false, 2=true. The reason I do this is because I 
	 * want to simplify user interaction and not request the user to insert a boolean, but I still wanted a boolean
	 * value to compare to the boolean value of tusk.
	 * 1= 1. No tusk brilliance=false		elephant1.getTusk()=false
	 * 2= 2. Tusk mastery=true				elephant2.getTusk()=true*/
	@Override
	public void trick(boolean tusk) {
		Scanner inputTrick = new Scanner(System.in);
		int trickster = inputTrick.nextInt();
		boolean who = (trickster == 1 ? false : true);

		if (who == tusk) {		//who(false) == elephant?.getTusk() = true! 
			System.out.println("\nTrumper");
			System.out.println("Trumper likes to embrace the lack of tusks, he is showing us how he can play with\n"
					+ " hoops with his trunk without his tusks getting in the way his fun. He is also able to use\n"
					+ " shortcuts through the trees and obstacles when playing tag with Flutter, where she would get\n"
					+ " stuck.");
		} else {
			System.out.println("\nFlutter");
			System.out.println("Flutter uses her trunk to place things on her tusks. She can balance a few things\n"
					+ " for quite a long time. She is now showing you how she can open the gates to their dwelling\n"
					+ " by just using her tusks. This way she can carry trinkets that she likes to collect while\n"
					+ " she creates passage for the both of them.");
		}
	}
	
	//not using these abstract methods, but chase() is ready to be used if needed
	@Override
	public void chase(Animal friend) {
		System.out.println(getName() + " chases " + friend.getName() + "at " + currSpeed + "km/h.");
	}

	@Override
	public void topViewSpeed(Animal nimble) {
	}
}