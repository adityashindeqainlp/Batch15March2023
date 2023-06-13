package OOPS_Inheritance;

/**
 * aditya shinde Java + Selenium Core 09-Jun-2023 1:08:20 pm
 */
public class P4_Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Composition for Static Method and Variable
		P1_ParentClass.m1();
		System.out.println(P1_ParentClass.a);

		// Composition for Non static Method and Variable
		P1_ParentClass obj = new P1_ParentClass();
		obj.m2();
		System.out.println(obj.b);
	}
}
