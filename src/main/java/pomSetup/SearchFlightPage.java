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
		driver.manage().window().maximize();
		driver.get("https://www.expedia.com/");
		etSearch = new ExpediaTravelSearch(driver);
	}
	@Test
	public void searchFlight() {
		etSearch.clickFlightsTab();
		etSearch.enterOriginDetails("Hyderabad");
		etSearch.enterdestinationDetails("New York");
		etSearch.enterStartDate("08/01/2019");
		etSearch.enterEndDate("08/01/2019");
		etSearch.searchFlight();
	}
}
