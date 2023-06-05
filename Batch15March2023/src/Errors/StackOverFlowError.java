package Errors;

/**
 * aditya shinde Java + Selenium Core 05-Jun-2023 10:38:03 am
 */
public class StackOverFlowError {

	public static void m1() {

		System.out.println("Calling of static method m2 in static method m1");

		m2();

	}

	// Cyclic Dependencies Between M1 AND M2

	public static void m2() {

		System.out.println("Calling static method m1 in static method m2");

		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();

	}

}
