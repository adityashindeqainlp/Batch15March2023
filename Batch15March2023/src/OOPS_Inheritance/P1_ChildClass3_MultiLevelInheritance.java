package OOPS_Inheritance;

/**
 * aditya shinde Java + Selenium Core 08-Jun-2023 10:54:53 am
 */
public class P1_ChildClass3_MultiLevelInheritance extends P1_ChildClassSimpleInheritance1 {

	/*
	 * Multilevel Inheritance --> Parent Class Extends in Child Class 1 then Child
	 * Class 1 Extends in Child Class 3
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calling Static methods of both child class 1 and parent class
		m1();

		m3();

		// Calling non Static methods of both child class 1 and parent class

		P1_ChildClass3_MultiLevelInheritance obj = new P1_ChildClass3_MultiLevelInheritance();

		obj.m2();

		obj.m4();
	}

}
