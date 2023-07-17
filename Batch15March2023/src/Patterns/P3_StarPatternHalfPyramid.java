package Patterns;

/**
 * @Author -- Aditya Shinde Java + Selenium 13-Jul-2023 10:06:49 am
 **/
public class P3_StarPatternHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
