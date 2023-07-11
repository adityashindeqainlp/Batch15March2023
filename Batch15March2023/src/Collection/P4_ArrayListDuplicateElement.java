package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author -- Aditya Shinde Java + Selenium 11-Jul-2023 9:32:36 am
 **/
public class P4_ArrayListDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Removing the Duplicate Elements in array then print the array in console */

		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 4, 5, 4, 5, 5, 6, 7, 7, 7, 8, 9));

		// Method 1 Using LinkedHashSet
		LinkedHashSet<Integer> b = new LinkedHashSet<Integer>(a);

		ArrayList<Integer> aWithoutDuplicate = new ArrayList<Integer>(b);

		System.out.println(aWithoutDuplicate);

		// Method 2 Java Stream Class

		List<Integer> a1 = a.stream().distinct().collect(Collectors.toList());

		System.out.println(a1);

	}

}
