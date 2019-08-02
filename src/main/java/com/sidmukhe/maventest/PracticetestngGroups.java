package com.sidmukhe.maventest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticetestngGroups {

	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("before");
	}
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("after");
	}
	@Test (groups = {"cars","sedan"})
	public void driveToyotaCorolla () {
		System.out.println("Driving Sedan Car");
	}
	
	@Test (groups = {"cars","sedan"})
	public void driveHondaAccord () {
		System.out.println("Driving Sedan Car");
	}
	
	@Test (groups = {"scooty"})
	public void driveActiva5G () {
		System.out.println("Driving Honda scooty - Activa5G");
	}
	
	@Test (groups = {"scooty"})
	public void driveAccess125 () {
		System.out.println("Driving Honda scooty - Access125");
	}
}
