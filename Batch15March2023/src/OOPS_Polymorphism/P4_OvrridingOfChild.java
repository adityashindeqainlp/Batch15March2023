package OOPS_Polymorphism;

/**
 * aditya shinde Java + Selenium Core 13-Jun-2023 10:45:11 am
 */
public class P4_OvrridingOfChild extends P3_OvrridingParent {

	public static void m1() {

		System.out.println("Static Method of Child Class");
	}

	public void m2() {

		System.out.println("Non Static Method of Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scenario 1
		// Method Hiding --> Only calls native class static method
		m1();

		// Scenario 2
		// Child Reference and Child Object
		P4_OvrridingOfChild obj = new P4_OvrridingOfChild();
		// Child Method gets called only
		obj.m2();

		// Scenario 3
		// Parent Reference and Child Object
		P3_OvrridingParent obj1 = new P4_OvrridingOfChild();
		// Compiler Suggest Parent method but in run time child method will get execute
		obj1.m2();

		// Scenario 4
		// Parent Reference and Parent Object //Composition
		P3_OvrridingParent obj3 = new P3_OvrridingParent();
		// Parent Method gets called only
		obj3.m2();

	}

}
