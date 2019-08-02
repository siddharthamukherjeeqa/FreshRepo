package com.sidmukhe.maventest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practiceenabled {

	@Test (enabled=true)
	public void printStringmessage () {
		System.out.println(true);
		SoftAssert sa = new SoftAssert();
		PracticesoftAssert pa = new PracticesoftAssert();
		int value = pa.softAssertTest(10, 10);
		sa.assertEquals(value, 20);
		System.out.println(false);
		sa.assertEquals(value+10, 30);
		System.out.println(false);
		sa.assertAll();
	}
	@Test (enabled=false)
	public void dontprintStringmessage () {
		System.out.println(false);
	}
	
}
