package CoreJava;

/**
 * aditya shinde Java + Selenium Core 05-Jun-2023 12:27:12 pm
 */
public class P6_CallingStaticInNonStatic {

	public static void method1() {

		System.out.println("Static Method");
	}

	public void method2() {

		// Calling of Static Method Inside Non static Method

		method1();
	}

	public static void main(String[] args) {

		P6_CallingStaticInNonStatic obj = new P6_CallingStaticInNonStatic();

		obj.method2();
	}

}
