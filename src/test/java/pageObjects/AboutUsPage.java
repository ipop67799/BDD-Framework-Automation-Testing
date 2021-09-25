package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage {
	public WebDriver driver;
	By emailID = By.xpath("//a[@class='Xx']");
	
	public AboutUsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement EmailID() {
		return driver.findElement(emailID);
	}
}
