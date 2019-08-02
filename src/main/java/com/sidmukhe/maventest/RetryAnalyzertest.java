package com.sidmukhe.maventest;

import org.testng.Assert;
import org.testng.annotations.Test;

import listnerPackage.RetryAnalyzer;



public class RetryAnalyzertest {
	int i = 0;
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void checkRetryTest() {
		
		System.out.println("Check : "+ i++);
		Assert.assertEquals(2+2,4,"Addition Problem! 2+2 must be 4!\n");
	}

}
