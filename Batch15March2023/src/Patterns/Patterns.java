package Patterns;

/**
 * @Author -- Aditya Shinde Java + Selenium 13-Jul-2023 4:51:43 pm
 **/
public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * **** **** **** ****
		 */

//		System.out.println("****");
//		System.out.println("*");
//		System.out.println("*");
//		System.out.println("*");

		int n = 4;
		char ch = 'a';

		for (int row = 1; row <= n; row++) {

			for (int cell = 1; cell <= row; cell++) {

				System.out.print(ch + " ");
				ch++;

			}
			System.out.println();
		}

	}

}
