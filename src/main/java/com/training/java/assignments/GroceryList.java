package com.training.java.assignments;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryItems; // List to store grocery items

	// Constructor to initialize the grocery list
	public GroceryList() {
		groceryItems = new ArrayList<String>();
	}

	// Method to add an item to the grocery list
	public void addItem(String item) {
		groceryItems.add(item);
		System.out.println(item + " has been added to the grocery list.");
	}

	// Method to remove an item from the grocery list
	public void removeItem(String item) {
		if (groceryItems.remove(item)) {
			System.out.println(item + " has been removed from the grocery list.");
		} else {
			System.out.println(item + " is not in the grocery list.");
		}
	}

	// Method to view all items in the grocery list
	public void viewList() {
		if (groceryItems.isEmpty()) {
			System.out.println("The grocery list is empty.");
		} else {
			System.out.println("Current Grocery List:: " + groceryItems);
		}
	}
}