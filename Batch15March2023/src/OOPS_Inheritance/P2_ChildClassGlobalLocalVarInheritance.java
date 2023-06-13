package OOPS_Inheritance;

/**
 * aditya shinde Java + Selenium Core 09-Jun-2023 10:36:17 am
 */
public class P2_ChildClassGlobalLocalVarInheritance extends P1_ParentClass {

	public static int a = 10;
	public int b = 20;

	public static void m1() {

		int a = 1;
		int b = 2;

		// Calling Local variable
		System.out.println("Local Var : " + a);
		System.out.println("Local Var : " + b);

		// Calling Native Global Variable
		System.out.println("Global Var of Child : " + P2_ChildClassGlobalLocalVarInheritance.a);

		P2_ChildClassGlobalLocalVarInheritance obj = new P2_ChildClassGlobalLocalVarInheritance();
		System.out.println("Global Var of Child : " + obj.b);

		// Calling Parent Class Global variable
		System.out.println("Parent Class Global Var : " + P1_ParentClass.a);

		P1_ParentClass obj1 = new P2_ChildClassGlobalLocalVarInheritance();
		System.out.println("Parent Class Global Var : " + obj1.b);

	}

	public void m2() {

		int a = 1;
		int b = 2;

		// Calling Local variable
		System.out.println("Local Var : " + a);
		System.out.println("Local Var : " + b);

		// Calling Native Global Variable
		System.out.println("Global Var of Child : " + P2_ChildClassGlobalLocalVarInheritance.a);
		System.out.println("Global Var of Child : " + this.b);

		// Calling Parent Class Global variable
		System.out.println("Parent Class Global Var : " + P1_ParentClass.a);
		System.out.println("Parent Class Global Var : " + super.b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
		
		System.out.println();
		
		P2_ChildClassGlobalLocalVarInheritance obj = new P2_ChildClassGlobalLocalVarInheritance();
        obj.m2();
		
	}

}
