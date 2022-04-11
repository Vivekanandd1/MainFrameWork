package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	 By Login = By.xpath("//a[text()='Form Authentication']");
	 
	 public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement login() {
		  return driver.findElement(Login);
	 }

}
