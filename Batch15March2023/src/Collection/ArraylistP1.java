package Collection;

import java.util.ArrayList;

/**
 * aditya shinde Java + Selenium Core 05-Jun-2023 8:45:17 am
 */
public class ArraylistP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Define the array List
		ArrayList<Integer> ar = new ArrayList<Integer>();

		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);

		// Print The array
		System.out.println(ar);

		// Add Values to array.

		ar.add(5, 6);

		System.out.println(ar);

		ar.set(0, 9);

		System.out.println(ar);

	}

}
