package com.framework.testng.concepts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {

	int count = 0;
	int retryCount = 2;

	@Override
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess()) {
			if(count<retryCount) {
				count++;
				return true;
			}
		}

		return false;
	}

}
