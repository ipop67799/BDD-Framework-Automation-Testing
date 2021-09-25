package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoresPage {
	public WebDriver driver;
	By storeExample = By.xpath("//h3[contains(text(),'Hadapsar, Pune')]");
	By storeAddress = By.xpath("//div[contains(text(),'1A & 1C, Ground Floor, Kumar Primus, Opp to Maruti')]");
	
	public StoresPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement StoreExample() {
		return driver.findElement(storeExample);
	}
	
	public WebElement StoreAddress() {
		return driver.findElement(storeAddress);
	}
}
