package Patterns;

/**
 * @Author -- Aditya Shinde Java + Selenium 13-Jul-2023 9:49:42 am
 **/
public class P2_StarPatternHollowSQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 5;
		int c = 5;

		for (int i = 1; i <=r; i++) {

			for (int j = 1; j <=c; j++) {

				if(i==1 || j==1 || i==r || j==c) {
					
					System.out.print("*");
				}else {
					
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
