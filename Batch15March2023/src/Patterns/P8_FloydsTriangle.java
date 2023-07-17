package Patterns;

/**
 * @Author -- Aditya Shinde Java + Selenium 13-Jul-2023 11:09:09 am
 **/
public class P8_FloydsTriangle {

	public static void main(String[] args) {

		int n = 4;
		int number = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(number + " ");

				number++;
			}
			System.out.println();
		}

	}

}
