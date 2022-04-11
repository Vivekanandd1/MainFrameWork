package PageObject;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginPage { 
	public WebDriver driver;
	 By EmailBox = By.id("username");
	 By PasswrdBox = By.id("password");
	 By LoginBtn = By.cssSelector("i.fa.fa-2x.fa-sign-in");
	 
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginwindow(String username,String password) {
		driver.findElement(EmailBox).sendKeys(username);
		driver.findElement(PasswrdBox).sendKeys(password);
		driver.findElement(LoginBtn).click();        
	}
	
	
}
