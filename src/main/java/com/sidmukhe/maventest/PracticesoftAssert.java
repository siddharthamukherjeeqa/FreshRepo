package com.sidmukhe.maventest;

import org.testng.annotations.Test;

public class PracticesoftAssert {

	public int softAssertTest (int b, int c) {
		int a;	
		a = (b + c);
		return a;
	}
	@Test
	public void sumofInt() {
		int result = this.softAssertTest(5, 5);
		System.out.println(result);
	}
}
