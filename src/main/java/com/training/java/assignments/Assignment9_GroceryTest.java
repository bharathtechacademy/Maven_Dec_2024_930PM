package com.training.java.assignments;

public class Assignment9_GroceryTest {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        
        String[] Groceries = {"Apples", "Bananas", "Carrots", "Tomatoes", "Milk", "Bread", "Eggs", "Cheese", "Butter", "Potatoes"};

        // Add random groceries
        System.out.println("Adding groceries...");
        for (int i = 0; i < Groceries.length; i++) {
            groceryList.addItem(Groceries[i]);
        }

        // View the list
        System.out.println("Viewing the grocery list:");
        groceryList.viewList();

        // Remove random groceries
        System.out.println("Removing random groceries...");
        groceryList.removeItem("Bananas");        

        // View the updated list
        System.out.println("Viewing the updated grocery list:");
        groceryList.viewList();
    }
}
