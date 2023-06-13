package OOPS_Inheritance;

/**
 * aditya shinde Java + Selenium Core 08-Jun-2023 10:38:09 am
 */
public class P1_ParentClass {

	//Inheritance of Variables 
	public static int a = 100;
	public  int b = 200;
	
	// Inheritance Of Methods
	public static void m1() {

		System.out.println("Static Method Of Parent Class");
	}

	public void m2() {

		System.out.println("Non static method of Parent Class");
	}

	// Inheritance of Constructor 
	
	public P1_ParentClass() {
		
		System.out.println("Non Parameterised Constructor of parent class");
	}
	
	public P1_ParentClass(int a) {
		
		System.out.println("Parameterised Constructor parent class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
