package OOPS_Inheritance;

/**
 * aditya shinde Java + Selenium Core 08-Jun-2023 10:41:20 am
 */

public class P1_ChildClassSimpleInheritance1 extends P1_ParentClass {

	public static void m3() {
		
		System.out.println("Static method of child class");
	}
	
	public void m4() {
		
		System.out.println("Non Static method of child class");
	}
	
	// Simple Inheritance --> Child extends Parent

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1(); // Calling Static Method of Parent Class

		P1_ChildClassSimpleInheritance1 obj = new P1_ChildClassSimpleInheritance1();
		obj.m2(); // Calling of non static method of parent class
	}

}
