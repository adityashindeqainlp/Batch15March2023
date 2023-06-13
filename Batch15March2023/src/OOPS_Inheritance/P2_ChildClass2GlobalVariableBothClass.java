package OOPS_Inheritance;

/**
 * aditya shinde Java + Selenium Core 09-Jun-2023 9:58:35 am
 */
public class P2_ChildClass2GlobalVariableBothClass extends P1_ParentClass {

	public static int a = 10;
	public int b = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calling native global static and non static variable

		System.out.println("Child Class Variable : " + a);

		P2_ChildClass2GlobalVariableBothClass obj = new P2_ChildClass2GlobalVariableBothClass();
		System.out.println("Child Class Variable : " + obj.b);

		// Calling global static and non static variable of parent class

		System.out.println("Parent Class Variable : " + P1_ParentClass.a); // ClassName.Variable

		// Parent class reference = Child Class Object
		P1_ParentClass obj1 = new P2_ChildClass2GlobalVariableBothClass();
		System.out.println("Parent Class Variable : " + obj1.b);
	}

}
