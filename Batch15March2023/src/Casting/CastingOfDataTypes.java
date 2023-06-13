package Casting;

/**
 * aditya shinde Java + Selenium Core 08-Jun-2023 2:17:09 pm
 */
public class CastingOfDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Up casting
		byte a = 100; // 1 Byte == 8 bits
		int b = a; // 4 Byte == 32 bits

		System.out.println(b);

		int c = 10000;
		double d = c; // 8 Byte == 64 bites

		System.out.println(d);


	     //Down Casting 
		int a1 = 100000; // 4 byte 
		
		byte b1 =  (byte) a1; // 1 byte
		
		System.out.println(b1);
	
		double c1 = 111222.333;
		
		int d1 = (int) c1;
		
		System.out.println(d1);
	
	
	
	
	
	}

}
