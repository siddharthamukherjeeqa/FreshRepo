package com.sidmukhe.maventest;

import org.testng.annotations.Test;

public class PracticeTimeout {
	
	@Test (timeOut = 100)
	public void driveAccess125 () throws InterruptedException {
		System.out.println("Driving Honda scooty - Access125");
		Thread.sleep(10);
	}

}
