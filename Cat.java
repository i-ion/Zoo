import java.util.concurrent.ThreadLocalRandom;

//Cat child class of Animal parent class
public abstract class Cat extends Animal {

	
	/*creating any Cat object would include this, written so that these values has to be set. */
	public Cat(String name, String gender, int age, int whiskers) {
		super(name, gender, age);		//this. setters taken from super class Animal
	}									//felines, unlike the elephants, have whiskers.
										//I want their whiskers set when Cat objects 
										//are created
	/*this method is used in .topViewSpeed() method in the Animal class
	 * method parameter: Animal object. I want the object executing the method to interact with another 
	 * Animal object.*/
	@Override
	public void chase(Animal friend) {
		System.out.println(getName() + " chases after " + friend.getName() + " at " + getCurrSpeed()
				+ "km/h to win the race to the food");
	}
	
	
	/*I am not using the abstract methods .trick() and .feed() for the cats, but because they are 
	 * abstracted from the Animal class it seems like I have to implement them.*/
	@Override
	public void trick(boolean tusk) {
	}
	@Override
	public void feed(Human guide) {
	}

}
