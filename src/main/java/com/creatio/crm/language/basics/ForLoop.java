package com.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ForLoop {

	public static void main(String[] args) {

		String[] empNames = new String[5];
		empNames[0] = "Amit";
		empNames[1] = "Anurag";
		empNames[2] = "Devi";
		empNames[3] = "Bharath";
		empNames[4] = "Suresh";		

		// for loop
		for (int i = 0; i < empNames.length; i++) {
			System.out.println(empNames[i]);
		}
		System.out.println("****************************");

		// for each loop
		for (String value : empNames) {
			System.out.println(value);
		}
		System.out.println("****************************");

		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Amit");
		empNamesHashSet.add("Anurag");
		empNamesHashSet.add("Devi");
		empNamesHashSet.add("Amit");
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add(null);
		empNamesHashSet.remove("Bharath");
		empNamesHashSet.add("Aasha");

		// for each loop
		for (String value : empNamesHashSet) {
			System.out.println(value);
		}
		System.out.println("****************************");

		Map<Integer, String> empNamesHashMap = new HashMap<Integer, String>();
		empNamesHashMap.put(1, "Amit");
		empNamesHashMap.put(2, "Anurag");
		empNamesHashMap.put(2, "Devi");
		empNamesHashMap.put(3, "Amit");
		empNamesHashMap.put(4, "Bharath");
		empNamesHashMap.put(5, null);
		empNamesHashMap.put(null, "Aasha");
		empNamesHashMap.remove(4);
		System.out.println("Total Values in HashMap are :" + empNamesHashMap.size());
		System.out.println(empNamesHashMap);

		// for each loop
		for (Integer key : empNamesHashMap.keySet()) {
			System.out.println(empNamesHashMap.get(key));
		}

	}

}
