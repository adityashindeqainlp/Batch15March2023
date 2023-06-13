package CoreJava;

/**
 * aditya shinde Java + Selenium Core 08-Jun-2023 10:04:51 am
 */
public class P18_ForLoopInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize the for loop

		for (int i = 0; i <= 5; i++) {

			System.out.println("Itration Number : " + i);
		}

		System.out.println();

		// Print 0 to 100 Numbers in the console
		for (int i = 0; i <= 100; i++) {

			System.out.print(i + " ");
		}
		System.out.println();

		// Print 0 to 100 Odd Numbers in the Console
		for (int i = 0; i <= 100; i++) {

			if (i % 2 != 0) {

				System.out.print(i + " ");
			}
		}
		System.out.println();

		// Print 0 to 100 Even Numbers in the console
		for (int i = 0; i <= 100; i++) {

			if (i % 2 == 0) {

				System.out.print(i+" ");
			}
		}

	}

}
