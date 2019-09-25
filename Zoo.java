import java.util.Scanner;

public class Zoo {

	private static int donation;

	public static void main(String[] args) {
		
		/*creating Animal objects and setting their traits. Using polymorphism when creating class objects*/
		Animal cheetah1 = new Cheetah("Smidge", "female", 7, 118);		
		Animal cheetah2 = new Cheetah("Zip", "female", 12, 123);		
		Animal lion1 = new Lion("Nala", "female", 19, 8);
		Animal lion2 = new Lion("Scar", "male", 12, 2);
		Animal elephant1 = new Elephant("Trumper", "male", 21, false);
		Animal elephant2 = new Elephant("Flutter", "female", 9, true);

		//creating Human objects and setting their traits.
		Human guide1 = new Staff("Mary", "female", 32);								
		Human guide2 = new Staff("Jeff", "male", 47);
		
		//the program starts to print out here
		System.out.println("Hello and welcome to African Legacy Sanctuary.");
		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \n");

		//asking the user(tourist) to pay. Parameters: pay R20, scenario that follows scanner initiation - gets sent to the
		//method in Staff class, int to store given donation value, set to 0.
		guide1.pleaseDonate(20, "group gathering area.", 0);		
		System.out.println(" ");									

		guide1.speak("You are welcome to visit any one of the stalls. The tour will start in 10 minutes.");

		System.out.println("\n. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .\n");

		//multidimensional array of strings, using a for-loop with an inner for loop to iterate through the 2D array.
		String[][] stalls = new String[][] { { "SlushPupper", "Burger Monkeys" }, { "Chip 'n Dip", "Juice Bar" },
				{ "Spur", "Froot Loop" } };

		System.out.println("Food court: \n");				//I am having trouble with multidimensional string arrays?
		for (int i = 0; i < 3; i++) {						//I can't see if the problem lays in the array itself or in the 
			for (int j = 0; j < 2; j++) {					//iteration of the array
				System.out.println(stalls[i][j]);
			}
		}

		System.out.println("\n. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \n");
		
		guide2.speak("I hope you have all the snacks you need to take on our adventure!");
		guide2.speak("Please follow me to the Den of Hunters. Here we are going to meet \n" + lion1.getName() + " and "
				+ lion2.getName() + ".");

		System.out.println("\n. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \n");

		
		guide1.speak("Here we have " + lion1.getName() + " basking in the rays of sunshine. She is \n"
				+ "still young, but she is a fierce huntress.\n");

		guide2.speak("We have received reports from our analysts just this morning! " + lion1.getName() + " has \n"
				+ "about " + lion1.getWhiskers() + " whiskers to aid her in the hunt. \n");

		guide1.speak(lion2.getName() + " sports about " + lion1.getWhiskers()
				+ " whiskers, but his mane is still the main \n" + "attraction, haha!\n");
		
		//calling the .eats() abstract Animal method. Eats method implementation differs in each child class of Animal.
		//abstraction in action. @Override method can be found in Lion class.
		lion1.eats();
		System.out.println(" ");

		guide1.speak("Let's give the lions some food and see how hungry they are on a scale of 0 to 10. \n");
		
		//calling .hungerReaction() Animal method to choose a random number between 0-10. All Animal child classes can 
		//use this same method. Method can be found in the Animal parent class
		lion1.hungerReaction();
		lion2.hungerReaction();
		System.out.println(" ");
		
		guide1.speak("Alright! Now that we've fed the lions, let's move on to the cable cars.");

		System.out.println("\n. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \n");
		
		//reusing the same pleaseDonate method, but with different parameter values.
		guide2.pleaseDonate(10, "cable car entance", 0);

		System.out.println("\n. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \n");

		/*topViewSpeed() is an abstract method in the Cheetah class. I wrote it exclusively for the Cheetah class to 
		 * perform a possible race that might happen (if running speed > 110) and to display a few other methods inside
		 * of an if statement. But, I think because I am using method parameters that I have to make it abstract?? I am 
		 * struggling to have the method belong to the child class, Cheetah, alone. "method topViewSpeed() is undefined 
		 * by the type Animal." || or, maybe it is because I have abstract methods inside of this method? I guess that 
		 * would make a lot more sense.*/
		cheetah1.topViewSpeed(cheetah2);
		System.out.println(" ");

		guide1.speak("Now we are going to visit the gentle beasts at the elephant sanctuary. ");

		System.out.println("\n. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \n");

		guide1.speak("Here we have our lovely friends " + elephant1.getName() + " and " + elephant2.getName() + ". \n");

		elephant1.eats();
		System.out.println(" ");

		guide2.speak("The elephants look quite hungry! You are welcome to feed the elephants some of their\n"
				+ " favourite snacks, which you can get from " + guide1.getName() + " for a small donation. \n");

		/*make the program a little more interactive and give the user kind of like a choice? They will be able.
		 * to choose how many marula fruit they would like*/
		guide1.speak("For every extra R5 you donate, you'll get an extra marula to treat the elephants with.\n"
				+ " To get some carrots and a marula fruit, please donate R5. \n");

		/*.feed() is another abstract method. Of course, it can be implemented with every child class because I've made it
		 * abstract, the abstraction method used here can be found in the Elephant class, where I explain what I do
		 * parameters: Human guide, to send to the class so that it can be used in said method. Using parameters to have
		 * Human objects interact with Animal objects and their traits*/
		elephant1.feed(guide1);		//using a new scanner input, other than .pleaseDonate() because I wish
									//to use the value in another way


		System.out.println("\n. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \n");

		guide1.speak("Both of the elephants can do some cool tricks! As you can see, one of the elephants doesn't have any \n"
						+ "tusks. It is extrememly unfortunate, but that doesn't stop him from playing with his best friend and learning \n"
						+ "new skills! Sadly we only have time to have one of them show you some tricks, so you get to choose who you \n"
						+ "would like to see show off their skills. \n");

		System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \n");

		//asking the user if they would like to see tricks from the elephant without tusks, or the one who has tusks
		System.out.println("1. No tusks brilliance ");
		System.out.println("2. Tusk mastery ");

		System.out.println("\n. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \n");
		
		/*calling .trick() with parameters: elephant1.getTusk() to get the boolean for if the object has tusks or not.
		 * In the method I concocted a way to make the user input value (1 or 2) a boolean value. I want 1=false and
		 * 2=true. elephant1.getTusk()=false and elephant2.getTusk()=true*/
		elephant1.trick(elephant1.getTusk());		//using a new scanner input, other than .pleaseDonate(),
													//because I wish to use the value in another way

		System.out.println("\n. . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . \n");

		guide1.speak("Thank you for joining us on an African Legacy adventure. We hope you enjoyed visiting the sanctuary \n"
						+ "and that we'll see you again soon!");
	}
/////// F I N ///////
};