package OOPS_Inheritance;

/**
 * aditya shinde Java + Selenium Core 09-Jun-2023 10:52:11 am
 */
public class P3_ChildClassConstructorInheritance extends P1_ParentClass {

	public P3_ChildClassConstructorInheritance() {

		System.out.println("Child Class Constructor");

		// Calling Parameterized Constructor of child
	}

	public P3_ChildClassConstructorInheritance(int a) {
		// Constructor chaining
		this();
	}

	public P3_ChildClassConstructorInheritance(int a, int b) {
		// Calling Non Parameterized Constructor of parent
		super();
	}

	public P3_ChildClassConstructorInheritance(boolean b) {
		// Calling Parameterized Constructor of parent
		super(30);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //new P3_ChildClassConstructorInheritance();
		//new P3_ChildClassConstructorInheritance(10);
		//new P3_ChildClassConstructorInheritance(10, 20);
		// new P3_ChildClassConstructorInheritance(true);
	}

}
