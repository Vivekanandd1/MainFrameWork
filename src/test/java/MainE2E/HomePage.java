package MainE2E;

import java.io.IOException;
import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;

public class HomePage extends Base {
	
	 @BeforeTest
	 public void Startup() throws IOException {
		 driver = driverStart();
			String Urlname = prop.getProperty("url");
			driver.get(Urlname);
	 }
	 
	

	@Test(dataProvider = "getdata" )
	public void HomePageNavigation(String username,String password) throws IOException {
		
		LandingPage Lp = new LandingPage(driver);
		LoginPage Lpp = new LoginPage(driver);
		Lp.login().click();
		Lpp.loginwindow(username, password);
		Lpp.TextVerification();
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[1][2];
		data[0][0] = "tomsmith";
		data[0][1] = "SuperSecretPassword!";
		
//		data[1][0] = "broda";
//		data[1][1] = "brpda";
		return data;
		}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
