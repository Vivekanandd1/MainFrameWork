package MainE2E;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;

public class HomePage extends Base {
	 
	

	@Test(dataProvider = "getdata" )
	public void HomePageNavigation(String username,String password) throws IOException {
		driver = driverStart();
		driver.get("http://the-internet.herokuapp.com/");
		LandingPage Lp = new LandingPage(driver);
		LoginPage Lpp = new LoginPage(driver);
		Lp.login().click();
		Lpp.loginwindow(username, password);
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[2][2];
		data[0][0] = "tomsmith";
		data[0][1] = "SuperSecretPassword!";
		
		data[1][0] = "broda";
		data[1][1] = "brpda";
		return data;
		}

}
