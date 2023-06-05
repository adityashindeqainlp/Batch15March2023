package Errors;

import java.util.Scanner;

/**
 * aditya shinde Java + Selenium Core 02-Jun-2023 2:26:18 pm
 */
public class AssertionErrorInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter marks: ");

		int marks = sc.nextInt();

		assert marks >= 40 : "Failed";

		System.out.println("Passed : " + marks);

	}

}
