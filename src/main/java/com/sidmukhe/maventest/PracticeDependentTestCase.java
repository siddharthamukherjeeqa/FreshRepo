package com.sidmukhe.maventest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeDependentTestCase {

	@Test (dependsOnMethods = {"driveSedanCar"})
	public void driveToyotaCorolla () {
		System.out.println("Driving Sedan Car");
	}
	
	@Test (dependsOnMethods = {"driveSedanCar"})
	public void driveHondaAccord () {
		System.out.println("Driving Sedan Car");
	}
	@Test
	public void driveSedanCar () {
		System.out.println("Break Not working");
		Assert.assertEquals("Break Fail", "Break Fail");
	}
	@Test
	public void driveScooty () {
		System.out.println("Driving Honda scooty - Honda");
	}
	@Test (dependsOnMethods = {"driveScooty"})
	public void driveActiva5G () {
		System.out.println("Driving Honda scooty - Activa5G");
	}
	
	@Test (dependsOnMethods = {"driveScooty"})
	public void driveAccess125 () {
		System.out.println("Driving Honda scooty - Access125");
	}
	
}
