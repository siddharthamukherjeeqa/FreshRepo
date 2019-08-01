package com.sidmukhe.maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaTravelSearch {
	WebDriver driver;	
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flightsTab;
	
	@FindBy(id="tab-hotel-tab-hp")
	WebElement hotelTab;
	
	@FindBy(id="flight-origin-hp-flight")
	WebElement origin;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement destination;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement sDate;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement dDate;
	
	@FindBy(xpath = "//button[@class='btn-primary btn-action gcw-submit']")
	WebElement search;
	
	public ExpediaTravelSearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightsTab(){
		flightsTab.click();
	}
	public void clickHotelTab(){
		hotelTab.click();
	}
	
	public void searchFlight(){
		search.click();
	}
	
	public void enterOriginDetails(String value) {
		origin.sendKeys(value);
	}
	public void enterdestinationDetails(String value) {
		destination.sendKeys(value);
	}
	public void enterStartDate(String value) {
		sDate.sendKeys(value);
	}
	public void enterEndDate(String value) {
		dDate.sendKeys(value);
	}
}
