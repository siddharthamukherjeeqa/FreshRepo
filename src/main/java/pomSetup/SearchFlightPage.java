package pomSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
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
	@Test(dataProvider = "getData")
	public void searchFlight(String origin, String destination, String sDate, String eDate) {
		etSearch.clickFlightsTab();
		etSearch.enterOriginDetails(origin);
		etSearch.enterdestinationDetails(destination);
		etSearch.enterStartDate(sDate);
		etSearch.enterEndDate(eDate);
		etSearch.searchFlight();
	}
	@DataProvider
	public Object[][] getData() {
		Object [][] data = new Object[1][4];
		data[0][0] = "Hyderabad";
		data[0][1] = "New York";
		data[0][2] = "01/01/2020";
		data[0][3] = "01/01/2020";
		return data;
	}
}
