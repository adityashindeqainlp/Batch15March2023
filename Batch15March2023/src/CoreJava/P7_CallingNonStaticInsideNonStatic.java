package CoreJava;

/**
 * aditya shinde Java + Selenium Core 05-Jun-2023 12:30:26 pm
 */
public class P7_CallingNonStaticInsideNonStatic {

	public void method1() {

		System.out.println("Non static method");
	}

	public void method2() {

		// Calling of Non static Method inside Non Static Method
		method1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P7_CallingNonStaticInsideNonStatic obj = new P7_CallingNonStaticInsideNonStatic();
		obj.method2();

	}

}
