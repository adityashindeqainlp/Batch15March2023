package Patterns;

/**
 * @Author -- Aditya Shinde Java + Selenium 13-Jul-2023 10:50:19 am
 **/
public class P6_NumberPatternHalfPyramid {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}

	}

}
