package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	public WebDriver driver;
	By excludeOutOfStock = By.id("filters_availability_In_Stock_Only");
	By antonStudyTable = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[5]/a[1]/div[2]/span[1]");
	By galenStudyChair = By.xpath("//span[contains(text(),'Galen Study Chair')]");
	By galenStudyChairPrice = By.xpath("//body/div[1]/div[2]/div[3]/div[3]/div[3]/div[1]/div[2]/div[1]/div[4]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]");
	By arabiaProduct = By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/div[1]/a[1]/img[1]");
	By arabiaProductDiscount = By.xpath("//div[contains(text(),'8% OFF')]");
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement ExcludeOutOfStock() {
		return driver.findElement(excludeOutOfStock);
	}
	
	public WebElement AntonStudyTable() {
		return driver.findElement(antonStudyTable);
	}
	
	public WebElement GalenStudyChair() {
		return driver.findElement(galenStudyChair);
	}
	
	public WebElement GalenStudyChairPrice() {
		return driver.findElement(galenStudyChairPrice);
	}
	
	public WebElement ArabiaProduct() {
		return driver.findElement(arabiaProduct);
	}
	
	public WebElement ArabiaProductDiscount() {
		return driver.findElement(arabiaProductDiscount);
	}
}
