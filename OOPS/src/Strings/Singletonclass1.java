package Strings;
class Singleton12 {
	// Static variable single_instance of type Singleton
	private static Singleton12 single_instance =  new Singleton12();
	// Declaring a variable of type String
	public String s;
	// Constructor of this class, Here private constructor is is used to restricted to this class itself
	private Singleton12() {
		s = "Hello I am a string part of Singleton class";
	}
	// Method Static method to create instance of Singleton class
	public static Singleton12 getInstanceOfSingleton() {
		// To ensure only one instance is created		
		return single_instance;
	}
}
public class Singletonclass1 {
	// Main driver method
	public static void main(String args[]) {
		// Instantiating Singleton class with variable x
		Singleton12 x = Singleton12.getInstanceOfSingleton();
		System.out.println("String from x is: " + x.s);
		// Instantiating Singleton class with variable y
		Singleton12 y = Singleton12.getInstanceOfSingleton();
		System.out.println("String from y is: " + y.s);
		// instantiating Singleton class with variable z
		Singleton12 z = Singleton12.getInstanceOfSingleton();
		System.out.println("String from z is: " + z.s);
		// Now changing variable of instance x via toUpperCase() method
		System.out.println("**********After converting to upper case*********");
		x.s = (x.s).toUpperCase();
		// Print and display commands
		System.out.println("String from x is: " + x.s);	
		System.out.println("String from y is: " + y.s);
		System.out.println("String from z is: " + z.s);
		System.out.println("\n");
		// Now again changing variable of instance x
		System.out.println("**********After converting to lower case*********");
		z.s = (z.s).toLowerCase();
		System.out.println("String from x is: " + x.s);
		System.out.println("String from y is: " + y.s);
		System.out.println("String from z is: " + z.s);
	}
}

