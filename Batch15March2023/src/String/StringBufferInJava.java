package String;

/**
 * aditya shinde Java + Selenium Core 07-Jun-2023 2:24:47 pm
 */
public class StringBufferInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Define StingBuffer with Normal Constructor
		StringBuffer sb = new StringBuffer();
		// Method 2 Capacity - Used to calculate StringBuffer Capacity
		int a = sb.capacity();
		System.out.println(a);

		// Define StringBuffer With Particular String
		StringBuffer sb1 = new StringBuffer("Hika");

		// Method 1 append - to add new string in existed string
		sb1.append(" Lamu ");
		System.out.println(sb1);

		sb1.append(true);
		System.out.println(sb1);
		
		int b = sb1.capacity();
		
		//Method 3 Length() - Calculates the length of string value in StringBuffer 
		int c = sb1.length();
		System.out.println(c);
		
		
		
		//Method 4 Insert()- To insert new string in pre existed string on the basis of index number
		
		StringBuffer sb2 = new StringBuffer("Hello"); // 0 - H , 1 - e , 2 - l , 3 - l , 4 - o
		
		sb2.insert(3, "World");
		
		System.out.println(sb2);
	
		
		//Method 5 Replace()
		// 0 - H , 1 - e , 2 - l , 3 - l , 4 - W , 5 - o , 6 - r ,7 - l , 8 - d , 9 - o
		sb2.replace(3, 8, "");
		System.out.println(sb2);
		
		// Method 6 Delete()
		// 0 - H , 1 - e , 2 - l , 3 - l , 4 - o
		sb2.delete(1, 4);
		System.out.println(sb2);
		
	}

}
