import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {

	private int CurrSpeed;
	private String name;
	private String gender;
	private int age;
	private int whiskers;
	private Food food;
	private int hunger;
	private double speed;
	public String currSpeed;
	private boolean tusk;

	// creating any animal would include this, and I wrote it so that these values
	// has to be set.
	public Animal(String name, String gender, int age) {
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
	}

	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//create random number between 120-400 to say how many whiskers the animal object has
	public int getWhiskers() {
		int whiskers = ThreadLocalRandom.current().nextInt(120, 400 + 1);
		return whiskers;
	}
	public void setWhiskers(int whiskers) {
		this.whiskers = whiskers;
	}

	
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}

	//create random number between 0-10 to rate the hunger of the animal object
	public int getHunger() {
		int hunger = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		return hunger;
	}
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

	
	public boolean getTusk() {
		return tusk;
	}
	public void setTusk(boolean tusk) {
		this.tusk = tusk;
	}

	/*create random speed, but has multiple decimals, so I created currSpeed
	 * to limit the decimals to only 2. I had trouble doing both at the same time*/
	public double getSpeed() {
		double speed = ThreadLocalRandom.current().nextDouble(90, 130);
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	//currSpeed = speed with 2 decimals, I use currSpeed instead of speed when printing value
	public String getCurrSpeed() {
		String currSpeed = String.format("%.2f", getSpeed());
		return currSpeed;
	}
	public void setCurrSpeed(String currSpeed) {
		this.currSpeed = currSpeed;
	}

	/*using ternary operator to react to the hunger of the Animal object. Using the random int hunger that 
	has been stored.*/
	public void hungerReaction() {
		int react = getHunger();
		String hungerScale = (react > 5 ? "very hungry today." : "not too hungry today.");
		System.out.println(getName() + " is " + hungerScale + " Let's rate that a " + react + " out of 10.");
	}

	
	//abstract methods declared to be used in child classes
	public abstract void topViewSpeed(Animal nimble);	//used in Cheetah class

	public abstract void eats();						//used in Lion, Cheetah and Elephant class

	public abstract void feed(Human guide);				//used in Elephant class

	public abstract void trick(boolean tusk);			//used in Elephant class

	public abstract void chase(Animal friend);			//used in Lion and Cheetah
}