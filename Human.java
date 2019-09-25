import java.util.Scanner;

/*parent class Human
 * I created a Human class, when I could've made a Staff class alone, but I wanted to have Human specific 
 * traits and show that the Staff class does something specific, where there can be more child classes*/
public abstract class Human {

	private String name;
	private String gender;
	private int age;
	private int donation;		//the user input when donating .pleaseDonate() is stored here
	
	//whenever I create a Human object, the following information would have to be declared
	public Human(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
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
	
	
	public int getDonation() {
		return donation;
	}

	public void setDonation (int donation) {
		this.donation = donation;
	}

	//declaring abstract methods to be used in Staff child class
	public abstract int pleaseDonate(int i, String scenario, int donation);  //returning an int (donation) to be
																			 //stored to use at another time
	public abstract void speak(String talk);
	
}
