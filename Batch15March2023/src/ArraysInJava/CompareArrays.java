package ArraysInJava;

import java.util.Arrays;

/**
 * aditya shinde Java + Selenium Core 05-Jun-2023 2:16:20 pm
 */
public class CompareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 11, 22, 33, 44 };
		int[] c = { 1, 2, 3, 4 };

		// Comparing Arrays Together by Using "Arrays" class "equals" method

		boolean check1 = Arrays.equals(a, b);
		System.out.println(check1);

		boolean check2 = Arrays.equals(b, c);
		System.out.println(check2);

		boolean check3 = Arrays.equals(a, c);
		System.out.println(check3);

		System.out.println();

		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(c, b));
		System.out.println(Arrays.equals(a, c));

	}

}
