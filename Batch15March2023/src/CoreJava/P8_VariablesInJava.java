package CoreJava;

/**
 * aditya shinde Java + Selenium Core 05-Jun-2023 12:34:59 pm
 */
public class P8_VariablesInJava {

	// Defining Global static and Non static variables in java
	public static int a = 20;
	public int b = 30;

	public static void main(String[] args) {

		//Calling of Global Static Variable 
		System.out.println(a);
		
		//Calling of Global Non static variable 
		P8_VariablesInJava obj = new P8_VariablesInJava();
		System.out.println(obj.b);
		
		//Value Reassignment for Global static Variable
		a=200;
		System.out.println("After Upadte: " + a);
		
		//Value Reassignment for Global Non static Variable
		obj.b=100;
		System.out.println("After Update: " + obj.b);
		
		//Reassignment on the basis of objects 
		P8_VariablesInJava obj2 = new P8_VariablesInJava();
		obj2.b=101;
		System.out.println("After Update: " + obj2.b);
		System.out.println(obj.b);
		
	}
}
