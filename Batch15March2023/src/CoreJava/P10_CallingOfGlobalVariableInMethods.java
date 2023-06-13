package CoreJava;

/**
 * aditya shinde Java + Selenium Core 07-Jun-2023 9:51:30 am
 */
public class P10_CallingOfGlobalVariableInMethods {

	public static int a = 10;
	public int b = 20;

	public static void m1() {

		// Calling Global Static Variable in static method
		System.out.println(a);

		// Calling Global No static Variable in Static Method
		P10_CallingOfGlobalVariableInMethods obj = new P10_CallingOfGlobalVariableInMethods();
		System.out.println(obj.b);
	}

	public void m2() {

		// Calling Global Static Variable in Non static method
		System.out.println(a);

		// Calling Global No static Variable in Non Static Method
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1(); //Static Method
		
		//Non-Static Method
		P10_CallingOfGlobalVariableInMethods obj = new P10_CallingOfGlobalVariableInMethods();
        obj.m2();
		
	}

}
