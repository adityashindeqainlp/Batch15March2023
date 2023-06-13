package CoreJava;

/**
 * aditya shinde Java + Selenium Core 07-Jun-2023 10:59:59 am
 */
public class P14_ConstructorsInJava {

	public P14_ConstructorsInJava() {

		System.out.println("Non Parameterised Constructor");
	}

	// Constructor Overloading
	public P14_ConstructorsInJava(int a) {

		System.out.println("Parameterised Constructor 1");

	}

	public P14_ConstructorsInJava(int b, int c) {

		this(); // Constructor Chaining

		System.out.println("Parameterised Constructor 2");
	}

	public static void main(String[] args) {

		//Calling Non-Parameterized Constructor 
		new P14_ConstructorsInJava(); 
		
		System.out.println();
		
		//Calling Parameterized Constructor 
		new P14_ConstructorsInJava(20); 
		
		System.out.println();
		
		new P14_ConstructorsInJava(10,30); 
		
	}

}
