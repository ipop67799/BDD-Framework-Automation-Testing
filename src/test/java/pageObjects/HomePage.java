package pageObjects;
import org.openqa.selenium.*;
public class HomePage {
	public WebDriver driver;
	
	By wishlist = By.xpath("//header/div[1]/div[1]/section[3]/ul[1]/li[3]/a[1]/div[1]/span[1]/*[1]");
	By search = By.id("search");
	By giftCards = By.xpath("//a[contains(text(),'Gift Cards')]");
	By cart = By.xpath("//header/div[1]/div[1]/section[3]/ul[1]/li[4]/a[1]/div[1]/span[1]/*[1]");
	By aboutUs = By.xpath("//a[contains(text(),'About Us')]");
	By cin = By.xpath("//body[@id='home']/div[@class='container']/footer[@id='footer']/div[@id='footer-links']/div[@class='row']/div[@class='col-md-3 links no-padding']/ul[@class='no-padding bodytext']/li[2]");
	By stores = By.xpath("//a[@class='featuredLinksBar__link'][contains(text(),'Stores')]");
	By help = By.xpath("//body/div[1]/footer[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]");
	By email = By.id("email_id");
	By subscribe = By.xpath("//body/div[1]/footer[1]/div[1]/div[1]/form[1]/div[2]/input[1]");
	By subscribeValidation = By.xpath("//div[contains(text(),'Thanks for subscribing!')]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement Wishlist() {
		return driver.findElement(wishlist);
	}
	
	public WebElement Search() {
		return driver.findElement(search);
	}
	
	public WebElement GiftCards() {
		return driver.findElement(giftCards);
	}
	
	public WebElement Cart() {
		return driver.findElement(cart);
	}
	
	public WebElement AboutUs() {
		return driver.findElement(aboutUs);
	}
	
	public WebElement CIN() {
		return driver.findElement(cin);
	}
	
	public WebElement Stores() {
		return driver.findElement(stores);
	}
	
	public WebElement Help() {
		return driver.findElement(help);
	}
	
	public WebElement Email() {
		return driver.findElement(email);
	}
	
	public WebElement Subscribe() {
		return driver.findElement(subscribe);
	}
	
	public WebElement SubscribeValidation() {
		return driver.findElement(subscribeValidation);
	}
}
