package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage {
	public WebDriver driver;
	By helpSearchBar = By.id("help-center-search-input");
	By deliveryQuery = By.xpath("//div[contains(text(),'What is the estimated delivery time?')]");
	By deliveryQueryResponse = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[1]/div[3]/p[1]");
	
	public HelpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement HelpSearchBar() {
		return driver.findElement(helpSearchBar);
	}
	
	public WebElement DeliveryQuery() {
		return driver.findElement(deliveryQuery);
	}
	
	public WebElement DeliveryQueryResponse() {
		return driver.findElement(deliveryQueryResponse);
	}
}
