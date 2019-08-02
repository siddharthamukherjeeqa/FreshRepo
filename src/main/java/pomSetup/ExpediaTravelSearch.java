package pomSetup;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
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
		reliableFindElement(flightsTab);
		flightsTab.click();
	}
	public void clickHotelTab(){
		reliableFindElement(hotelTab);
		hotelTab.click();
	}
	
	public void searchFlight(){
		reliableFindElement(search);
		search.click();
	}
	
	public void enterOriginDetails(String value) {
		reliableFindElement(origin);
		origin.sendKeys(value);
	}
	public void enterdestinationDetails(String value) {
		reliableFindElement(destination);
		destination.sendKeys(value);
	}
	public void enterStartDate(String value) {
		reliableFindElement(sDate);
		sDate.sendKeys(value);
	}
	public void enterEndDate(String value) {
		reliableFindElement(dDate);
		dDate.sendKeys(value);
	}
	private static final int DEFAULT_TIMEOUT_IN_SECONDS = 10;

	public WebElement reliableFindElement(WebElement element) {
	    long endTime = System.currentTimeMillis() + 
	    Duration.ofSeconds(DEFAULT_TIMEOUT_IN_SECONDS).toMillis();
	    while (System.currentTimeMillis() < endTime) {
	        try {
	            return element;
	        } catch (NoSuchElementException ignored) {
	            System.out.println("Not found, trying again...");
	        }
	    }
	    throw new NoSuchElementException("Could not find " + element);
	}
}
