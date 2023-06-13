package CoreJava;

/**
 * aditya shinde Java + Selenium Core 07-Jun-2023 10:01:59 am
 */
public class P12_GlobalWithLoacalVarInNonStaticMethod {

	public static int a = 10;
	public int b = 20;

	public void m1() {

		int a = 1;
		int b = 2;

		System.out.println(a);

		// Calling global static variable in non static method
		System.out.println(P12_GlobalWithLoacalVarInNonStaticMethod.a);

		System.out.println(b);

		// Calling global non static variable in non static method
		System.out.println(this.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P12_GlobalWithLoacalVarInNonStaticMethod obj = new P12_GlobalWithLoacalVarInNonStaticMethod();
		obj.m1();

	}

}
