package CoreJava;

/**
 * aditya shinde Java + Selenium Core 08-Jun-2023 10:18:09 am
 */
public class P19_JumpStatmentsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Break Statement
		for (int i = 0; i <= 10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println("Number of Itration: " + i);
		}
		System.out.println();

		// Continue Statement
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("Number of Itration: " + i);
		}
		System.out.println();

		// Print 0 to 100 odd numbers using "continue"

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();

		// Print 0 to 100 even numbers using "continue"

		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
