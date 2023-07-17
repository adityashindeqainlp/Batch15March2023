package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author -- Aditya Shinde Java + Selenium 17-Jul-2023 9:56:36 am
 **/

public class P7_CompareHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "A");
		map2.put(3, "C");
		map2.put(2, "B");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");

		// Method 1 Compare HahMap Equals
		System.out.println(map1.equals(map3));
		System.out.println(map1.equals(map2));

		// Method 2 Compare By Using Key-set
		// Only Returns Unique Keys

		System.out.println(map1.keySet().equals(map3.keySet()));
		System.out.println(map1.keySet().equals(map2.keySet()));

		// Method 3 Finding Missing Key In HashMap

		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");

		// Step 1 Convert HashMap map1 To HahSet
		HashSet<Integer> combineKey = new HashSet<Integer>(map1.keySet());

		// Step 2 Add All Keys From HashMap Map4
		combineKey.addAll(map4.keySet());

		// Step 3 Remove all keys From HashMap map1
		combineKey.removeAll(map1.keySet());

		System.out.println(combineKey);

		// Method 4 Comparing the hashMap by using using Values

		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");

		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(1, "A");
		map6.put(3, "C");
		map6.put(2, "B");

		HashMap<Integer, String> map7 = new HashMap<Integer, String>();
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");

		// Step 1 Without Duplicate Value Convert Map To ArrayLsit
		/* ArrayList Accepts Duplicate Values */
		ArrayList<String> ar1 = new ArrayList<String>(map5.values());
		ArrayList<String> ar2 = new ArrayList<String>(map6.values());
		ArrayList<String> ar3 = new ArrayList<String>(map7.values());

		// Step 2 Using Equals Method Compare
		System.out.println(ar1.equals(ar2));
		System.out.println(ar1.equals(ar3));

		// Step 1 With Duplicate Value By Using HashSet
		/* Note - HashMap Accepts Unique Values */
		HashSet<String> set1 = new HashSet<String>(map5.values());
		HashSet<String> set2 = new HashSet<String>(map6.values());
		HashSet<String> set3 = new HashSet<String>(map7.values());

		// Step 2 Using Equals Method Compare
		System.out.println(set1.equals(set2));
		System.out.println(set1.equals(set3));
	}
}
