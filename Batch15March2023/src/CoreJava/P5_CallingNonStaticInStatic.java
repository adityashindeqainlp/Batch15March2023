package CoreJava;

/**
 * aditya shinde Java + Selenium Core 05-Jun-2023 12:23:40 pm
 */
public class P5_CallingNonStaticInStatic {

	public void method1() {

		System.out.println("Non Static Method");
	}

	public static void method2() {

		// Calling Non Static Method Inside Static Method

		P5_CallingNonStaticInStatic ref = new P5_CallingNonStaticInStatic();

		ref.method1();

	}

	public static void main(String[] args) {

		method2();

	}
}
