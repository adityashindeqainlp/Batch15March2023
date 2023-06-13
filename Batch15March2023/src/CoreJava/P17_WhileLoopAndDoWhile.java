package CoreJava;

/**
 * aditya shinde Java + Selenium Core 08-Jun-2023 9:47:32 am
 */
public class P17_WhileLoopAndDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print table of 2 in console

		int a = 2;
		int b = 1;

		while (b <= 10) {
			int c = a * b;
			System.out.println(c);
			b++;
		}
		System.out.println();

		// Print 0 to 100 Numbers in console

		int num = 0;

		while (num <= 100) {

			System.out.print(num + " ");

			num++;
		}
		System.out.println();

		// Print Odd Numbers in console from 0 to 100

		int no = 0;

		while (no <= 100) {

			if (no % 2 != 0) {

				System.out.print(no + " ");
			}
			no++;
		}

		int no1 = 0;

		System.out.println();

		// Print the even number in console from 0 to 100
		while (no1 <= 100) {

			if (no1 % 2 == 0) {

				System.out.print(no1 + " ");
			}
			no1++;
		}

		System.out.println();

		// Do-While Loop
		int no2 = 10;

		do {
			System.out.println("Print the number ");
		} while (no2 < -1);

	}
}