package com.sidmukhe.maventest;

import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	public void driveToyotaCorolla () throws InterruptedException {
		System.out.println("Driving Corolla Car");
		Thread.sleep(3000);
		System.out.println("Honking");
	}
	
	@Test
	public void driveHondaAccord () throws InterruptedException {
		System.out.println("Driving Honda Accord Car");
	}
}
