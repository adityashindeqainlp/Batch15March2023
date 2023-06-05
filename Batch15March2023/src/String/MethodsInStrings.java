package String;

/**
 * aditya shinde Java + Selenium Core 05-Jun-2023 3:31:16 pm
 */
public class MethodsInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Method -1 charAt
		String s = "Hika";
		char c = s.charAt(2); // Provide the index value and get the character of the mentioned index
		System.out.println(c);

		// Method -2 concat
		String s1 = "Lamu ";
		String s2 = s1.concat(s);// Concat the 2 different string together
		System.out.println(s2);

		// Method -3 equals
		String a = "hika";
		String b = "hika";
		
		boolean check = a.equals(b); //Compare the 2 different string
		System.out.println(check);
		
		//Method -4 equalIgnoreCase();
		
		String d ="HIKA";
		String e = "Hika";
		
		boolean check1 = a.equalsIgnoreCase(d); //Ignore the case sensitivity then compare objects 
		boolean check2 = d.equalsIgnoreCase(e);
		
		System.out.println(check1);
		System.out.println(check2);
		
		//Method 5 - substr();
		String name = "Mohamed"; //0- M , 1 - o , 2 - h ,3 - a , 4 - m , 5 - e , 6 - d 
		
		String name1 = name.substring(5); // Use to create sub string from existing string by providing start index value 
		System.out.println(name1);
		
		
		//Method 6 - length();
		
		int value = name.length(); // Calculating the value of String 
		
		System.out.println("Mohamed name length : " + value);
		

	}

}
