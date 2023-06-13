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

		boolean check = a.equals(b); // Compare the 2 different string
		System.out.println(check);

		// Method -4 equalIgnoreCase();

		String d = "HIKA";
		String e = "Hika";

		boolean check1 = a.equalsIgnoreCase(d); // Ignore the case sensitivity then compare objects
		boolean check2 = d.equalsIgnoreCase(e);

		System.out.println(check1);
		System.out.println(check2);

		// Method 5 - substr();
		String name = "Mohamed"; // 0- M , 1 - o , 2 - h ,3 - a , 4 - m , 5 - e , 6 - d

		String name1 = name.substring(5); // Use to create sub string from existing string by providing start index
											// value
		System.out.println(name1);

		// Method 6 substr(Start Index , End Index)

		String name2 = name.substring(1, 5);

		System.out.println(name2);

		// Method 7 - length();

		int value = name.length(); // Calculating the value of String

		System.out.println("Mohamed name length : " + value);

		// Method 8 - Replace (Old char , new char)

		String n = "Mahedi";

		String n1 = n.replace('e', 'a');
		System.out.println(n1);

		// Replace All(Old String regex , New String regex )

		String n2 = n.replaceAll("e", "");
		System.out.println(n2);

		// Method 9 - toLowerCase() - Convert Upper case to lower case

		String a1 = "AMARSAN";

		String a2 = a1.toLowerCase();

		System.out.println(a2);

		// Method 10 - toUpperCase() - Convert Lower case to Upper case

		String a3 = a2.toUpperCase();

		System.out.println(a3);

		// Method 11 - trim() -

		String str = "      Aditya         ";

		// Before Trim
		System.out.println(str);

		String str1 = str.trim(); // Used to trim Suffix and Prefix spaces in string

		// After Trim
		System.out.println(str1);

		// Method 12 -indexOf() - To capture the index of specific character
		// --->
		String b1 = "Tom"; // 0 - T , 1 - o , 2 - m

		int idx = b1.indexOf('m');

		System.out.println(idx);

		// Method 13 lastIndexOf() - To capture index of specific character in reverse
		// manner
		// <----
		String b2 = "MrBean"; // 0 - M , 1 -r , 2 - B , 3 - e , 4 - a ,5 - n

		int idx1 = b2.lastIndexOf('a');

		System.out.println(idx1);

		// Method 14 Contains() - Check the character sequence with the existed string

		String h = "Google";

		boolean chk = h.contains("Go");

		System.out.println(chk);

		// Method 15 toCharArray

		String d1 = "MohammadMohaimen";

		char[] d2 = d1.toCharArray();

		for (int i = 0; i < d1.length(); i++) {

			System.out.print(d2[i] + " ");
		}

		System.out.println();

		for (int i = d1.length() - 1; i >= 0; i--) {

			System.out.print(d2[i] + " ");

		}

		System.out.println();

		// Method 16 ToDigit() - use to identify the given string holding any digits or
		// not by examine the index

		String r = "Aditya@123"; // 0 - A , 1 - d , 2 - i , 3 - t , 4 - y , 5 - a , 6 - @,7 - 1 , 8 - 2 ,9 - 3

		char checkr = r.charAt(7);

		boolean checkr1 = Character.isDigit(checkr);

		System.out.println(checkr1);

		// Method 17 Split()-

		String q1 = "Hika Lamu Aditya Shinde Mahdi Staali Mohamed Sohbi";

		String[] ns = q1.split(" ");

		for (int i = 0; i < ns.length; i++) {

			System.out.println(ns[i]);
		}
		
		//Method 18  isBlank();
		
		String v =  "      ";
		
		boolean v1 = v.isBlank();
		
		System.out.println(v1);
		
		boolean v2 = v.isEmpty();
		
		System.out.println(v2);
		

	}

}
