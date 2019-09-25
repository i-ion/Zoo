//Lion child class of Cat parent class
public class Lion extends Cat {
	
	//creating any Lion object would include this, written so that these values has to be set
	public Lion(String name, String gender, int age, int whiskers) {
		super(name, gender, age, whiskers);		//this. setters taken from super class Cat
	}
	
	/*I have created a enum class Food to store Food constants. Here I am calling meat and setting what 
	 * the lions eat.*/
	@Override
    public void eats() {
    	System.out.println( "The lions only eat " + Food.meat + ".");
    }

	@Override
	public void topViewSpeed(Animal nimble) {
	}

}
