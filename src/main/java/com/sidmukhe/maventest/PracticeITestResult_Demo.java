package com.sidmukhe.maventest;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class PracticeITestResult_Demo {

	@Test
	public void firstOne() {
		System.out.println("1st One");
		Assert.assertFalse(false);
	}
	
	@Test
	public void secondOne() {
		System.out.println("2nd One");
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void afterMethod(ITestResult itestResult) {
		
		if(itestResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed : "+itestResult.getName());
		}
		if(itestResult.getStatus() == ITestResult.SUCCESS) {
			System.out.println("Passed : "+itestResult.getName());
		}
	}
}
