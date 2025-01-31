package com.selenium.concepts;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionsConcepts {

	public static void main(String[] args) {

//		1. Hard Assertions (for validation)  ==> validate expected vs actual and fail the program immediately when both are not matching
		
		Assert.assertEquals("Google", "Google");
		Assert.assertNotEquals("Google", "Selenium");
		Assert.assertTrue(2>1);
		Assert.assertFalse(2<1);
		Assert.assertNull(null);
		Assert.assertNotNull(123);
//		Assert.fail("Simply Fail the Test");
		System.out.println("Execution Completed For Hard Assertions");
		
		
		
//		2. Soft Assertions (for verification) ==> verify expected vs actual and fail the program at the end if required
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("Google", "Yahoo");
		softAssert.assertNotEquals("Google", "Google");
		softAssert.assertTrue(0>1);
		softAssert.assertFalse(0<1);
		softAssert.assertNull(123);
		softAssert.assertNotNull(null);
		softAssert.fail("Simply Fail the Test");
		System.out.println("Execution Completed For Soft Assertions");
		softAssert.assertAll();

	}

}
