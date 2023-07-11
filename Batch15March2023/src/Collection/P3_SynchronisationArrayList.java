package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author -- Aditya Shinde Java + Selenium 10-Jul-2023 3:49:30 pm
 **/
public class P3_SynchronisationArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Method 1 		
		/*
		 * Use Collections Class to invoke SynchronizedList Pass Argument as Object of
		 * an ArrayList Store value in variable of List class
		 * 
		 * Collections.synchronizedList Thread-Safe
		 * 
		 */
		// To add and Remove value we don't required Explicit Synchronization
		List<String> langs = Collections.synchronizedList(new ArrayList<String>());
		langs.add("Java");
		langs.add("Python");
		langs.add("C#");
		langs.add("Ruby");

//Create Explicit Synchronized block for list and then iterate over it  to Fetch data from List
		synchronized (langs) {

			Iterator<String> it = langs.iterator();
			while (it.hasNext()) {

				System.out.println(it.next());
			}
		}

		System.out.println();

		// Method 2 copyOnWriteArrayList
		// No need of Explicit synchronization for add/remove/traverse
		//Thread-Safe 

		CopyOnWriteArrayList<String> arr = new CopyOnWriteArrayList<String>();

		arr.add("Aditya");
		arr.add("Hika");
		arr.add("Amarasan");
		arr.add("Mahdi");
		arr.add("Mohammmad");
		arr.add("Mohamed");

		Iterator<String> it1 = arr.iterator();

		while (it1.hasNext()) {

			System.out.println(it1.next());
		}

	}

}
