package Casting;

/**
 * aditya shinde Java + Selenium Core 08-Jun-2023 2:57:09 pm
 */
public class ChildClass extends ParentClass {

	public void m2() {

		System.out.println("Non Static Method Of Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Explicit Casting of class
		ChildClass obj2 = (ChildClass) new ParentClass();
		obj2.m1();
		obj2.m2();

	}

}
