package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiftCardsPage {
	public WebDriver driver;
	By termsConditionsMessage = By.xpath("//p[contains(text(),'The Urban Ladder Gift Cards (\"Gift Cards\") are iss')]");
	
	public GiftCardsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement TermsConditionsMessage() {
		return driver.findElement(termsConditionsMessage);
	}
}
