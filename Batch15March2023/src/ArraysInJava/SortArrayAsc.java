package ArraysInJava;

import java.util.Arrays;

/**
 * aditya shinde Java + Selenium Core 02-Jun-2023 3:34:37 pm
 */
public class SortArrayAsc {

	public static int temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 2 3 4 5
		int[] a = { 5, 2, 4, 3, 1, 6 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");
		}

		System.out.println();

		Arrays.sort(a);

		for (int i = a.length - 1; i >= 0; i--) {

			System.out.print(a[i] + " ");
		}

	}

}
