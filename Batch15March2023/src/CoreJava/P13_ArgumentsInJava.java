package CoreJava;

/**
 * aditya shinde Java + Selenium Core 07-Jun-2023 10:11:01 am
 */
public class P13_ArgumentsInJava {

	// Type 1 No Return No Args
	public static void m1() {

		System.out.println("No Return No Args");
	}

	// Type 2 No Return With Args
	public static void m2(int a) {

		System.out.println("No return With Args");
	}

	// Type 3 With Return With Args
	public static boolean m3(boolean b) {

		return b;
	}

	// Type 4 With Return No Args
	public static int m4() {
		int a = 100;
		int b = 200;
		int c = a + b;

		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();

		m2(15);

		System.out.println(m3(true));

		System.out.println(m4());

	}

}
