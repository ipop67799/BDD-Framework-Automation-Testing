package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	public WebDriver driver;
	By emptyMessage = By.xpath("//p[@class='empty_msg']");
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement EmptyMessage() {
		return driver.findElement(emptyMessage);
	}
}
