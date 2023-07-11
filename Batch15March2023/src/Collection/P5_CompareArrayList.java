package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Author -- Aditya Shinde Java + Selenium 11-Jul-2023 10:04:05 am
 **/
public class P5_CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Defining the array List
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 6));

		ArrayList<Integer> no = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		//Sorting the Array List
		Collections.sort(num);
		Collections.sort(no);
		
		// Compare 
		System.out.println(num.equals(no));
	
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Collections.sort(number);
		System.out.println(no.equals(number));
		
		/*Use Method in one by one for accurate results*/
		ArrayList<Character> a = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'f'));
		ArrayList<Character> b = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e'));
		
		
		//Find Out Additional element 
//		b.removeAll(a);
//		System.out.println(b); //[e]
		
		//Find Out Missing Element 
//		a.removeAll(b);
//		System.out.println(a); //[f] 
		
		//Find Out Duplicates in both array list
		a.retainAll(b);	
		System.out.println(a); //[a,b,c,d]
		
		
	}

}
