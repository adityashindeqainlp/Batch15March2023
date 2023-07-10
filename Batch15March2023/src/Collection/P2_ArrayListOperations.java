package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Author -- Aditya Shinde Java + Selenium 10-Jul-2023 10:30:31 am
 **/
public class P2_ArrayListOperations {

	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("C#");
		ar1.add("Pearl");
		ar1.add("JavaScript");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Selenium");
		ar2.add("Cucumber");
		ar2.add("TestNG");

		/* Use The Method in One By One Manner for accuracy & ease of understanding */

//		//Operation 1 Add All
//		ar1.addAll(ar2);
//		System.out.println(ar1);

//		//Operation 1.2 Add All using Index
//		ar1.addAll(1, ar2);
//		System.out.println(ar1);

//		// Operation 2 Clear
//		ar1.clear();
//		System.out.println(ar1);

//		// Operation 4 Clone
//		ArrayList<String> cloneAr1 = (ArrayList<String>) ar1.clone();
//		System.out.println(cloneAr1);

//		// Operation 5 Contains
//		boolean check = ar1.contains("Java");
//		System.out.println(check);
//		boolean check2 = ar1.indexOf("Pearl") < 0;
//		System.out.println(check2);

		// Operations 6 Last InedxOF

		ArrayList<String> list1 = new ArrayList<String>(
				Arrays.asList("Aditya", "Hika", "Amarsan", "Mahdi", "Mohammad", "Mohamed", "Tom", "Jerry"));

//		int p = list1.lastIndexOf("Tom");
//		System.out.println(p);

		// Operation 7 Remove

//		list1.remove(7);
//		System.out.println(list1);
//		list1.remove("Tom");
//		System.out.println(list1);

		ArrayList<Integer> numbers = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

//		numbers.removeIf(num -> num % 2 == 0);
//		System.out.println(numbers);

//		numbers.removeIf(num -> num % 2 != 0);
//		System.out.println(numbers);

		ArrayList<String> nameList = new ArrayList<String>(
				Arrays.asList("Aditya", "Hika", "Amarsan", "Mahdi", "Hika", "Hika"));

		// Operation 8 To Extract Specific Element from ArrayList Retain All
		// Here we use Collections class to invoke singleton method to extract only same
		// type of value

//		nameList.retainAll(Collections.singleton("Hika"));
//		System.out.println(nameList);

//		// Operation 9 subList
//		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
//
//		ArrayList<Integer> sublist = new ArrayList<Integer>(nums.subList(2, 6));
//		System.out.println(sublist);

		
//		// Operation 10 To Array
//		ArrayList newList = new ArrayList<String>(Arrays.asList("Aditya", "Hika", "Amarsan", "Mahdi", "Hika", "Hika"));
//		Object arr[] = newList.toArray();
//
//		for (Object a : arr) {
//
//			System.out.println(a);
//		}
	}

}
