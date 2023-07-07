package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @Author -- Aditya Shinde Java + Selenium 07-Jul-2023 1:08:05 pm
 **/
public class P1_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dynamic Array
		/*-------------------------------------------------------Raw TO Generic ArrayList---------------------------------*/
		// Generic way
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add("Aditya"); // 0
		ar.add("7"); // 1
		ar.add(12.12); // 2
		ar.add(true);// 3
		ar.add('a');// 4

		// Print Complete ArrayList
		System.out.println(ar);

		// Print Value According to Index
		System.out.println(ar.get(0));

		// Size of ArrayList
		System.out.println(ar.size());

		// Lower Size
		System.out.println("LI : " + 0);

		// Higher Size
		System.out.println("HI : " + (ar.size() - 1));

		// Changing the size of array By Adding the Value in it
		ar.add(100);
		ar.add(200);
		System.out.println(ar.size());

		System.out.println();

		/*-------------------------------------------------------Virtual & Physical Capacity of ArrayList---------------------------------*/
		ArrayList<Object> a = new ArrayList<Object>();

		System.out.println(a.size()); // Physical Capacity 0

		a.add(100);
		System.out.println(a.size()); // PC - 1

		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		System.out.println(a.size()); // PC - 5
		System.out.println();

		/*-------------------------------------------------------Defining ArrayList With DataTypes---------------------------------*/
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(101);
		b.add(102);

		ArrayList<Double> d = new ArrayList<Double>();
		d.add(123.14);
		d.add(521.3);

		ArrayList<String> n = new ArrayList<String>();
		n.add("Aditya");
		n.add("Hika");
		n.add("Mohammad");
		n.add("Mohamed");
		n.add("Mahdi");
		n.add("Amarsan");

		/*-------------------------------------------------------Extract Elements From ArrayList---------------------------------*/
		// Approach 1 Simple For loop
		for (int i = 0; i <= n.size() - 1; i++) {

			System.out.println(n.get(i));
		}

		System.out.println("---------------");

		// Approach 2 For Each

		for (String name : n) {

			System.out.println(name);
		}

		System.out.println("---------------");

		// Approach 3 Lambda Expression

		n.stream().forEach(ele -> System.out.println(ele));

		System.out.println("---------------");

		// Approach 4 Iterator

		Iterator<String> it = n.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}
		System.out.println();

		/*-------------------------------------------------------Define Another Array using ArrayList---------------------------------*/

		ArrayList<Integer>list = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
		System.out.println(list);
	}

}
