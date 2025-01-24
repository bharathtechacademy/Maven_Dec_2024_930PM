package com.training.java.assignments;

public class Arrays_Assignment2 {

	public static void main(String[] args) {
		
        // Categories and Sub categories 
        String[] mainCategories = {"Groceries", "Electronics"};        
        String[] subcategories = {"Beverages", "Snacks", "Dairy Products", "Produce"};
		
        // Define a 3D array to store products
        String[][][] products = new String[2][4][5];

        // Main Category 1: Groceries
        // Subcategory 1: Beverages
        products[0][0][0] = "Cola";
        products[0][0][1] = "Orange Juice";
        products[0][0][2] = "Lemonade";
        products[0][0][3] = "Green Tea";
        products[0][0][4] = "Black Coffee";

        // Subcategory 2: Snacks
        products[0][1][0] = "Popcorn";
        products[0][1][1] = "Trail Mix";
        products[0][1][2] = "Beef Jerky";
        products[0][1][3] = "Salted Nuts";
        products[0][1][4] = "Rice Cakes";

        // Subcategory 3: Dairy Products
        products[0][2][0] = "Cottage Cheese";
        products[0][2][1] = "Heavy Cream";
        products[0][2][2] = "Ice Cream";
        products[0][2][3] = "Parmesan Cheese";
        products[0][2][4] = "Eggnog";

        // Subcategory 4: Produce
        products[0][3][0] = "Apples";
        products[0][3][1] = "Bananas";
        products[0][3][2] = "Carrots";
        products[0][3][3] = "Potatoes";
        products[0][3][4] = "Onions";

        // Main Category 2: Electronics
        // Subcategory 1: Beverages
        products[1][0][0] = "Cola";
        products[1][0][1] = "Orange Juice";
        products[1][0][2] = "Lemonade";
        products[1][0][3] = "Green Tea";
        products[1][0][4] = "Black Coffee";

        // Subcategory 2: Snacks
        products[1][1][0] = "Popcorn";
        products[1][1][1] = "Trail Mix";
        products[1][1][2] = "Beef Jerky";
        products[1][1][3] = "Salted Nuts";
        products[1][1][4] = "Rice Cakes";

        // Subcategory 3: Dairy Products
        products[1][2][0] = "Cottage Cheese";
        products[1][2][1] = "Heavy Cream";
        products[1][2][2] = "Ice Cream";
        products[1][2][3] = "Parmesan Cheese";
        products[1][2][4] = "Eggnog";

        // Subcategory 4: Produce
        products[1][3][0] = "Apples";
        products[1][3][1] = "Bananas";
        products[1][3][2] = "Carrots";
        products[1][3][3] = "Potatoes";
        products[1][3][4] = "Onions";

	}

}
