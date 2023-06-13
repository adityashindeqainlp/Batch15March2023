package String;

/**
 * aditya shinde Java + Selenium Core 07-Jun-2023 3:27:18 pm
 */
public class ExceutionSpeedOfStringVsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime = System.currentTimeMillis();

		String s = "Hello";

		for (int i = 0; i <= 150000; i++) {

			s.concat("world");
		}

		System.out.println("Total Time For String : " + (System.currentTimeMillis() - startTime) + "ms");

		System.out.println();

		StringBuffer sb = new StringBuffer("Hello");

		startTime = System.currentTimeMillis();

		for (int i = 0; i <= 150000; i++) {

			sb.append("World");
		}

		System.out.println("Total Time For StringBuffer : " + (System.currentTimeMillis() - startTime) + "ms");

		System.out.println();

		StringBuilder sd = new StringBuilder("Hello");

		startTime = System.currentTimeMillis();

		for (int i = 0; i <= 150000; i++) {

			sb.append("World");
		}

		System.out.println("Total Time For StringBuilder : " + (System.currentTimeMillis() - startTime) + "ms");

	}

}
