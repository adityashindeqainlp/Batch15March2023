package ArraysInJava;

/**
 * aditya shinde Java + Selenium Core 02-Jun-2023 2:44:31 pm
 */
public class Oldways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[5];

		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		// a[5]=6;

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

		System.out.println();

		System.out.println(a.length); // 5

		System.out.println();

		//Printing array with loop
		for (int i = 0; i <a.length; i++) {

			System.out.println(a[i]);
		}

	}

}
