package Patterns;

/**
 * @Author -- Aditya Shinde Java + Selenium 13-Jul-2023 11:26:53 am
 **/
public class P9_BinaryPatternHalfPyramid {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				int sum = i + j;
				if (sum % 2 == 0) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
