package com.framework.testng.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

// Feature of TestNG

// 1. No need of calling the methods and duplicating methods, Annotations will takecare
// 2. Default reporting
// 3. Prioritizing Test cases
// 4. Grouping test cases
// 5. Executing specific test cases alone
// 6. Support dependency tests
// 7. Disable the test cases
// 8. Support parallel & cross-browser testing
// 9. Supports Listeners

public class AppCommons extends WebCommons {

	@Test(priority = 2, groups = { "Regression" })
	public void TestCase1() {
//		Assert.fail("Test Case 1 Failed");
		System.out.println("Test Case 1 - Home Page Executed Successfully...");
	}

	@Test(priority = 1, groups = { "Sanity" }, dependsOnMethods= {"TestCase1","TestCase3"}, enabled =true) //test is disabled if enabled is false
	public void TestCase2() {
		System.out.println("Test Case 2 - Add Product to Cart Feature Executed Successfully...");
	}

	@Test(dataProvider = "data", priority = 3, groups = { "Sanity", "Regression" })
	public void TestCase3(String username, String password) {
		System.out.println("Test Case 3 - Login Executed Successfully with..." + username + " ," + password);
	}
}
