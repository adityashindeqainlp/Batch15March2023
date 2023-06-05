package CoreJava;

/**
 * aditya shinde Java + Selenium Core 05-Jun-2023 11:28:29 am
 */
public class P4_CallingStaticInStatic {

	public static void method1() {

		System.out.println("Static method 1");
	}

	public static void method2() {

		// Calling of static method inside static method
		method1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method2();
	}

}
