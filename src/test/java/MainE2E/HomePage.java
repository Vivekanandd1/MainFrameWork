package MainE2E;

import java.io.IOException;
import org.testng.annotations.Test;

import PageObject.LandingPage;

public class HomePage extends Base {
	 
	

	@Test
	public void HomePageNavigation() throws IOException {
		driver = driverStart();
		driver.get("http://the-internet.herokuapp.com/");
		LandingPage Lp = new LandingPage(driver);
		Lp.login().click();
		
		
	}

}
