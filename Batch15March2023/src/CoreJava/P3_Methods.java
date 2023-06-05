package CoreJava;

/**
 * aditya shinde Java + Selenium Core 05-Jun-2023 11:11:58 am
 */
public class P3_Methods {

	// Defining Static method in class
	public static void method1() {

		System.out.println("Method 1 is static method ");
	}

	// Defining Non static method in class
	public void method2() {

		System.out.println("Method 2 is non static method ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calling of static method inside main method
		method1();

		// Calling O Non static method inside main method
		P3_Methods obj = new P3_Methods();
		obj.method2();
	}

}
