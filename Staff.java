import java.util.Scanner;

//Staff child class of Human parent class
public class Staff extends Human {
	
	private int donation;		//user input value for .pleaseDonate is stored here, to be used here.
	
	//whenever I create a Human object, the following information would have to be declared
	public Staff(String name, String gender, int age) {
		super(name, gender, age);	//the this. setters are taken from the super class, all humans
	}								//have the same traits in this case

	//use this method to have one of the guides talk
	@Override
	public void speak(String talk) {
		System.out.println("Guide "+ getName() + ":   " + talk);
	}

	/*this method asks the user to pay. Parameters: donation fee, scenario to be printed after conditions are met,
	 * an int to create memory to return given donation to use in the if-else if-else statement in this method.
	 * Using a while statement to put the scanner into to ask the user to pay and to also execute the if-else if-else
	 * statement.*/
	@Override
	public  int pleaseDonate(int donationFee, String scenario, int donation) {
		Scanner inputDonate = new Scanner(System.in);
		while (true) {
			System.out.println("To proceed, please make a small donation of R" + donationFee + ". \n");
			donation = inputDonate.nextInt();
			System.out.println(" ");
			
			/*using stored donation and the given donationFee to set conditions. I specifically wanted to stop the user
			 * from going forth if the conditions aren't met and I also wanted to give the user their change if they 
			 * paid more than what is expected*/
			if (donation == donationFee) {
				System.out.println("Thank you. You may proceed to the " + scenario + ".");
				break;
			} else if (donation > donationFee) {
				int change = donation - donationFee;		//calculating the change value
				System.out.println("Thank you! Here is your R" + change + " change. You may proceed to the " + scenario + ".");
				break;
			} else {
				System.out.println("Sorry, I can't let you go forth. ");
			}
			
			
		}
		return donation;
	}
}
