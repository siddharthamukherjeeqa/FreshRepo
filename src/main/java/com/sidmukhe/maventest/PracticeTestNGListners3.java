package com.sidmukhe.maventest;


import org.testng.Reporter;
import org.testng.annotations.Test;



public class PracticeTestNGListners3 {
	
	@Test
	public void testMethodOne() {
		System.out.println("testMethodOne");
		Reporter.log("testMethodOne");
	}
	
	@Test
	public void testMethodTwo() {
		System.out.println("testMethodTwo");
		Reporter.log("testMethodOne");
	}
}
