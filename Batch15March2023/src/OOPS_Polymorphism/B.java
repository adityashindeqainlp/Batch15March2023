package OOPS_Polymorphism;

/**
 * @Author -- Aditya Shinde Java + Selenium 02-Aug-2023 4:40:56 pm
 **/
public class B extends A {

	public static int a =10;
	public int b =20;
	
//	public static void m1() {
//
//		System.out.println("Static Of Child ");
//	}

//	public void m2(int a) {
//
//		System.out.println("Non static of child ");
//	}
	
//	public B() {
//		
//		System.out.println("Constructor Of Child ");
//	}
	
	

	public static void main(String[] args) {

		// static
		// Method Hiding
		// m1();
		
//		B obj = new B();
//		obj.m2(75);
//
//		A ref = new B();
//		ref.m2(0);
//		
//		A inst = new A();
//		inst.m2(10);
		
		//Static Var 
		
		System.out.println(a);
		
		B o1 = new B();
		System.out.println(o1.b);
		
		
	}

}
