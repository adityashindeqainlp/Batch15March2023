package OOPS_Inheritance;

/**
 * aditya shinde Java + Selenium Core 08-Jun-2023 10:47:44 am
 */
public class P1_ChildClass2_HierarchicalInheritance extends P1_ParentClass {

	// Hierarchical Inheritance --> 2 Child Class extends 1 Parent class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calling of parent class static method in child class 2
		m1();

		// Calling of Parent class Non static method in child class2
		P1_ChildClass2_HierarchicalInheritance obj = new P1_ChildClass2_HierarchicalInheritance();
		obj.m2();
	}

}
