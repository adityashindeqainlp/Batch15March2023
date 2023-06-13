package CoreJava;

/**
 * aditya shinde Java + Selenium Core 07-Jun-2023 9:43:38 am
 */
public class P11_GlobalWithLocalVariableInStaticMethod {

	public static int a = 10;
	public int b = 20;

	public static void method1() {

		int a = 1;
		int b = 2;

		System.out.println(a);

		// Calling Global Static Variable inside static method
		System.out.println(P11_GlobalWithLocalVariableInStaticMethod.a);

		System.out.println(b);

		// Calling Global non static variable inside static method
		P11_GlobalWithLocalVariableInStaticMethod obj = new P11_GlobalWithLocalVariableInStaticMethod();
		System.out.println(obj.b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1();

	}

}
