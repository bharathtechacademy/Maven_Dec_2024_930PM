package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsFramework {

	public static void main(String[] args) {
		
		
		String[] empNames = new String[3];
		empNames[0] = "Amit";
		empNames[1] = "Anurag";
		empNames[2] = "Devi";
//		empNames[3] = "Bharath";
		
		int [] empIds = new int [3];
		empIds[0] = 1234;
		empIds[1] = 1235;
		empIds[2] = 1236;
		
		System.out.println(empNames[0]);
		System.out.println(empIds[0]);
		
		System.out.println(empNames.length);
		System.out.println(empIds.length);
		
		//Challenges with Array
//		1. Fixed Length
//		2. Static memory allocation at the begining
//		3. similar data types
//		4. modifications not allowed
		
		//1. No need to specify the size of values while creating/initializing collections
		//2. It follows dynamic memory allocation
		//3. Collections allow multiple data types together stored at one place
		//4. Collections allows modifications
		
		//5. There are so many inbuilt functions/ utilities to manipulate the data /filter the data
		
		
		// List ==> ArrayList, LinkedList
			//	List can store multiple values with similar datatype together
			//	List can store duplicate values
			//	List follows dynamic memory allocation
			//  List allows modifications
		
		// Set  ==> HashSet, LinkedHashSet and TreeSet
			//	Set can store multiple values with similar datatype together
			//	Set cannot store duplicate values
			//	Set follows dynamic memory allocation
			//  Set allows modifications			
		
		// Map  ==> HashMap, LinkedHashMap, TreeMap and Hashtable
			//	Map can store multiple values with different datatypes together in the form of Key and Value
			//	Map can store duplicate values but won't allow duplicate Keys
			//	Map follows dynamic memory allocation
			//  Map allows modifications
		
		//differences between each collection concept
		
		// 1. Order of storing values
		// 2. Allowing null values
		// 3. Memory allocation
		
		
		//Wrapper Classes ==> 
		
		/******************************************** ArrayList ******************************************/
		//Syntax to initialize: List<DataType> variable = new ArrayList<DataType>(); //collections allows only non-primitive data types
		//Syntax to add value: variable.add(value);
		//Syntax to remove value: variable.remove(value);
		//Syntax to access the value: variable.get(index);
		//Syntax to get total values: variable.size();
		
		//Order : Insertion Order
		//Nulls : Allowed
		
		System.out.println("*************** ArrayList ***************");
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Amit");
		empNamesArrayList.add("Anurag");
		empNamesArrayList.add("Devi");
		empNamesArrayList.add("Amit");
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add(null);
		empNamesArrayList.remove("Bharath");
		System.out.println("Total Values in ArrayList are :"+empNamesArrayList.size());
		System.out.println(empNamesArrayList);
		
		/******************************************** LinkedList ******************************************/
		//Syntax to initialize: List<DataType> variable = new LinkedList<DataType>(); //collections allows only non-primitive data types
		//Syntax to add value: variable.add(value);
		//Syntax to remove value: variable.remove(value);
		//Syntax to access the value: variable.get(index);
		//Syntax to get total values: variable.size();
		
		//Order : Insertion Order
		//Nulls : Allowed
		
		System.out.println("*************** LinkedList ***************");
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Amit");
		empNamesLinkedList.add("Anurag");
		empNamesLinkedList.add("Devi");
		empNamesLinkedList.add("Amit");
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add(null);
		empNamesLinkedList.remove("Bharath");
		System.out.println("Total Values in LinkedList are :"+empNamesLinkedList.size());
		System.out.println(empNamesLinkedList);		
		
		/******************************************** HashSet ******************************************/
		//Syntax to initialize: Set<DataType> variable = new HashSet<DataType>(); //collections allows only non-primitive data types
		//Syntax to add value: variable.add(value);
		//Syntax to remove value: variable.remove(value);
		//Syntax to get total values: variable.size();
		
		//Order : Random Order
		//Nulls : Allowed
		
		System.out.println("*************** HashSet ***************");
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Amit");
		empNamesHashSet.add("Anurag");
		empNamesHashSet.add("Devi");
		empNamesHashSet.add("Amit");
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add(null);
		empNamesHashSet.remove("Bharath");
		empNamesHashSet.add("Aasha");
		System.out.println("Total Values in HashSet are :"+empNamesHashSet.size());
		System.out.println(empNamesHashSet);		
		
		/******************************************** LinkedHashSet ******************************************/
		//Syntax to initialize: Set<DataType> variable = new LinkedHashSet<DataType>(); //collections allows only non-primitive data types
		//Syntax to add value: variable.add(value);
		//Syntax to remove value: variable.remove(value);
		//Syntax to get total values: variable.size();
		
		//Order : Insertion Order
		//Nulls : Allowed
		
		System.out.println("*************** LinkedHashSet ***************");
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Amit");
		empNamesLinkedHashSet.add("Anurag");
		empNamesLinkedHashSet.add("Devi");
		empNamesLinkedHashSet.add("Amit");
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add(null);
		empNamesLinkedHashSet.remove("Bharath");
		empNamesLinkedHashSet.add("Aasha");
		System.out.println("Total Values in LinkedHashSet are :"+empNamesLinkedHashSet.size());
		System.out.println(empNamesLinkedHashSet);		
		
		/******************************************** TreeSet ******************************************/
		//Syntax to initialize: Set<DataType> variable = new TreeSet<DataType>(); //collections allows only non-primitive data types
		//Syntax to add value: variable.add(value);
		//Syntax to remove value: variable.remove(value);
		//Syntax to get total values: variable.size();
		
		//Order : Ascending Order
		//Nulls : Not Allowed
		
		System.out.println("*************** TreeSet ***************");
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Amit");
		empNamesTreeSet.add("Anurag");
		empNamesTreeSet.add("Devi");
		empNamesTreeSet.add("Amit");
		empNamesTreeSet.add("Bharath");
//		empNamesTreeSet.add(null);
		empNamesTreeSet.remove("Bharath");
		empNamesTreeSet.add("Aasha");
		System.out.println("Total Values in TreeSet are :"+empNamesTreeSet.size());
		System.out.println(empNamesTreeSet);		
		
		/******************************************** HashMap ******************************************/
		//Syntax to initialize: Map<Key, Value> variable = new HashMap<Key, Value>(); //collections allows only non-primitive data types
		//Syntax to add value: variable.put(key,value);
		//Syntax to remove value: variable.remove(key);
		//Syntax to get value: variable.get(key);
		//Syntax to get total values: variable.size();
		
		//Order : Random Order of Keys
		//Nulls : Null Keys allowed and Null Values also allowed
		
		System.out.println("*************** HashMap ***************");
		Map<Integer,String > empNamesHashMap = new HashMap<Integer, String>();
		empNamesHashMap.put(1,"Amit");
		empNamesHashMap.put(2,"Anurag");
		empNamesHashMap.put(2,"Devi");
		empNamesHashMap.put(3,"Amit");
		empNamesHashMap.put(4,"Bharath");
		empNamesHashMap.put(5,null);
		empNamesHashMap.put(null,"Aasha");
		empNamesHashMap.remove(4);
		System.out.println("Total Values in HashMap are :"+empNamesHashMap.size());
		System.out.println(empNamesHashMap);		
		
		/******************************************** LinkedHashMap ******************************************/
		//Syntax to initialize: Map<Key, Value> variable = new LinkedHashMap<Key, Value>(); //collections allows only non-primitive data types
		//Syntax to add value: variable.put(key,value);
		//Syntax to remove value: variable.remove(key);
		//Syntax to get value: variable.get(key);
		//Syntax to get total values: variable.size();
		
		//Order : Insertion Order of Keys
		//Nulls : Null Keys allowed and Null Values also allowed
		
		System.out.println("*************** LinkedHashMap ***************");
		Map<Integer,String > empNamesLinkedHashMap = new LinkedHashMap<Integer, String>();
		empNamesLinkedHashMap.put(1,"Amit");
		empNamesLinkedHashMap.put(2,"Anurag");
		empNamesLinkedHashMap.put(2,"Devi");
		empNamesLinkedHashMap.put(3,"Amit");
		empNamesLinkedHashMap.put(4,"Bharath");
		empNamesLinkedHashMap.put(5,null);
		empNamesLinkedHashMap.put(null,"Aasha");
		empNamesLinkedHashMap.remove(4);
		System.out.println("Total Values in LinkedHashMap are :"+empNamesLinkedHashMap.size());
		System.out.println(empNamesLinkedHashMap);		
		
		/******************************************** TreeMap ******************************************/
		//Syntax to initialize: Map<Key, Value> variable = new TreeMap<Key, Value>(); //collections allows only non-primitive data types
		//Syntax to add value: variable.put(key,value);
		//Syntax to remove value: variable.remove(key);
		//Syntax to get value: variable.get(key);
		//Syntax to get total values: variable.size();
		
		//Order : Ascending Order of Keys
		//Nulls : Null Keys are not allowed But Null Values allowed
		
		System.out.println("*************** TreeMap ***************");
		Map<Integer,String > empNamesTreeMap = new TreeMap<Integer, String>();
		empNamesTreeMap.put(1,"Amit");
		empNamesTreeMap.put(2,"Anurag");
		empNamesTreeMap.put(2,"Devi");
		empNamesTreeMap.put(3,"Amit");
		empNamesTreeMap.put(4,"Bharath");
		empNamesTreeMap.put(5,null);
//		empNamesTreeMap.put(null,"Aasha");
		empNamesTreeMap.remove(4);
		System.out.println("Total Values in TreeMap are :"+empNamesTreeMap.size());
		System.out.println(empNamesTreeMap);		
		
		/******************************************** Hashtable ******************************************/
		//Syntax to initialize: Map<Key, Value> variable = new Hashtable<Key, Value>(); //collections allows only non-primitive data types
		//Syntax to add value: variable.put(key,value);
		//Syntax to remove value: variable.remove(key);
		//Syntax to get value: variable.get(key);
		//Syntax to get total values: variable.size();
		
		//Order : Random Order of Keys
		//Nulls : Null Keys and Null Values both are not allowed
		
		System.out.println("*************** Hashtable ***************");
		Map<Integer,String > empNamesHashtable = new Hashtable<Integer, String>();
		empNamesHashtable.put(1,"Amit");
		empNamesHashtable.put(2,"Anurag");
		empNamesHashtable.put(2,"Devi");
		empNamesHashtable.put(3,"Amit");
		empNamesHashtable.put(4,"Bharath");
//		empNamesHashtable.put(5,null);
//		empNamesHashtable.put(null,"Aasha");
		empNamesHashtable.remove(4);
		System.out.println("Total Values in Hashtable are :"+empNamesHashtable.size());
		System.out.println(empNamesHashtable);	
		
		
		//Assignment - collections
		
		Map<String,String > student1Map = new HashMap<String,String>();
		Map<String,String > student2Map = new HashMap<String,String>();
		Map<String,String > student3Map = new HashMap<String,String>();
		
		List<Map<String,String >> studentList = new ArrayList<Map<String,String >>();
		studentList.add(student1Map);
		studentList.add(student2Map);
		studentList.add(student3Map);
		
		List<Map<String,String >> empList = new ArrayList<Map<String,String >>();
		List<Map<String,String >> productList = new ArrayList<Map<String,String >>();
		
		Map<String,List<Map<String,String >>> data = new HashMap<String,List<Map<String,String >>>();
		data.put("StudentData", studentList);
		data.put("ProductData", productList);
		
		data.get("ProductData").get(1).get("Supplier");
		
		
	}

}
