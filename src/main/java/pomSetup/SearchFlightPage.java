package pomSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchFlightPage {

	WebDriver driver;
	
	ExpediaTravelSearch etSearch;
	
	@BeforeClass
	public void intialize() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.expedia.com/");
		etSearch = new ExpediaTravelSearch(driver);
	}
	@Test
	public void searchFlight() {
		etSearch.clickFlightsTab();
		System.out.println("1");
		etSearch.enterOriginDetails("Hyderabad");
		System.out.println("2");
		etSearch.enterdestinationDetails("New York");
		System.out.println("3");
		etSearch.enterStartDate("01/01/2020");
		System.out.println("4");
		etSearch.enterEndDate("01/01/2020");
		System.out.println("5");
		etSearch.searchFlight();
		System.out.println("6");
	}
}
