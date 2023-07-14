package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @Author -- Aditya Shinde Java + Selenium 14-Jul-2023 1:03:00 pm
 **/
public class P6_HashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 1) Store the Value in the Form OF Key and Value Pair 2) Not Following the
		 * order / Indexing approach 3) Key should be unique always 4) Only one key
		 * should be null 5) Number of values can be null
		 * 
		 * 
		 */

		HashMap<String, String> countryMap = new HashMap<String, String>();

		// Put the value in HashMap Using the Object
		countryMap.put("India", "Delhi");
		countryMap.put("UK", "London");
		countryMap.put("USA", "Washington DC");

		// Defining Value with Null Key
		/* Only one key should be null */
		countryMap.put(null, "Moscow");
		countryMap.put(null, "Rome");

		// Defining key with null values
		/* HashMap allows multiple null values with keys */
		countryMap.put("Germany", null);
		countryMap.put("France", null);
		
		//Remove 
		countryMap.remove("France");

		// HashMap Printing
		System.out.println(countryMap.get("India"));
		System.out.println(countryMap.get(null));
		System.out.println(countryMap.get("France"));

		System.out.println();

		// Traverse over key set
		Iterator<String> it = countryMap.keySet().iterator();

		while (it.hasNext()) {

			String key = it.next();
			String value = countryMap.get(key);

			System.out.println("Key : " + key + " value : " + value);

		}

		System.out.println();

		// Traverse over entry set (k,v)

		Iterator<Entry<String, String>> it1 = countryMap.entrySet().iterator();

		while (it1.hasNext()) {

			Entry<String, String> entry = it1.next();

			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

		System.out.println();
		
		//Lambda Expression 
		countryMap.forEach((k,v) -> System.out.println("Key : " + k + " Value : " +v));
		
	}

}
