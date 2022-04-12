package PageObject;

import java.awt.RenderingHints.Key;
import java.util.logging.LogManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import MainE2E.HomePage;


public class LoginPage { 
//	public static final Logger log = LogManager.getLogger(LoginPage.class);
	public WebDriver driver;
	By EmailBox = By.id("username");
	 By PasswrdBox = By.id("password");
	 By LoginBtn = By.cssSelector("i.fa.fa-2x.fa-sign-in");
	 By TextVerify = By.tagName("h2");
	 String Actual = "Secure Area";
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginwindow(String username,String password) {
		driver.findElement(EmailBox).sendKeys(username);
		driver.findElement(PasswrdBox).sendKeys(password);
		driver.findElement(LoginBtn).click();        
	}
	
	public void TextVerification() {
		String Expected = driver.findElement(TextVerify).getText();
		Assert.assertEquals(Expected, Actual);
	}
	
}
