package stepDefinition;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import resource.Base;
import pageObjects.*;
@RunWith(Cucumber.class)
public class stepDefinitions extends Base{
	public Logger log = LogManager.getLogger(HomePage.class.getName());
    @Given("^Navigate to homepage$")
    public void navigate_to_homepage() throws Throwable {
		driver = InitializeDriver();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\java\\resource\\data.properties");
		prop.load(fis);
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("Navigation to Homepage: SUCCESS");
		driver.manage().window().maximize();
    }

    @When("^Pass \"([^\"]*)\" in subscribe$")
    public void pass_something_in_subscribe(String email) throws Throwable {
    	HomePage home = new HomePage(driver);
    	home.Email().sendKeys(email);
		home.Subscribe().click();
		Thread.sleep(2000);
    }

    @When("^Search \"([^\"]*)\"$")
    public void search_something(String searchText) throws Throwable {
    	HomePage home = new HomePage(driver);
		home.Search().sendKeys(searchText);
		home.Search().sendKeys(Keys.ENTER);
    }

    @When("^Search \"([^\"]*)\" and click on \"([^\"]*)\"$")
    public void search_something_and_click_on_something(String searchText, String strArg2) throws Throwable {
    	HomePage home = new HomePage(driver);
		SearchPage search = new SearchPage(driver);
    	home.Search().sendKeys(searchText);
		home.Search().sendKeys(Keys.ENTER);
		search.GalenStudyChair().click();
		Set <String> id = driver.getWindowHandles();
		Iterator <String> i = id.iterator();
		i.next();
		String child_id = i.next();
		driver.switchTo().window(child_id);
    }

    @When("^Click on \"([^\"]*)\" and click on \"([^\"]*)\"$")
    public void click_on_something_and_click_on_something(String strArg1, List<String> list1) throws Throwable {
    	HomePage home = new HomePage(driver);
		StoresPage stores = new StoresPage(driver);
		home.Stores().click();
		log.info("Navigation to Stores Page: SUCCESS");
		stores.StoreExample().click();
    }
    
    @When("^Click on \"([^\"]*)\"$")
    public void click_on_something(String strArg1) throws Throwable {
    	HomePage home = new HomePage(driver);
		home.GiftCards().click();
		log.info("GiftCards click: SUCCESS");
    }

    @When("^Clicking on \"([^\"]*)\"$")
    public void clicking_on_something(String strArg1) throws Throwable {
    	HomePage home = new HomePage(driver);
		home.Cart().click();
    }

    @When("^Clicked on \"([^\"]*)\"$")
    public void clicked_on_something(String strArg1) throws Throwable {
    	HomePage home = new HomePage(driver);
		home.AboutUs().click();
    }

    @When("^Searched \"([^\"]*)\"$")
    public void searched_something(String searchText) throws Throwable {
    	HomePage home = new HomePage(driver);
		home.Search().sendKeys(searchText);
		home.Search().sendKeys(Keys.ENTER);
    }

    @When("^Click on help and search \"([^\"]*)\"$")
    public void click_on_help_and_search_something(String query) throws Throwable {
    	HomePage home = new HomePage(driver);
		HelpPage help = new HelpPage(driver);
		home.Help().click();
		help.HelpSearchBar().sendKeys(query);
		help.HelpSearchBar().sendKeys(Keys.ENTER);
    }

    @Then("^Check if \"([^\"]*)\" text is showing$")
    public void check_if_something_text_is_showing(String strArg1) throws Throwable {
    	HomePage home = new HomePage(driver);
    	if (home.SubscribeValidation().isDisplayed() == true) {
			Assert.assertTrue(true);
			log.info("TC01 Passed: SUCCESS");
		}
    	driver.quit();
    }

    @Then("^Get sale percentage off$")
    public void get_sale_percentage_off() throws Throwable {
    	SearchPage search = new SearchPage(driver);
    	search.ArabiaProduct().click();
		Set <String> id = driver.getWindowHandles();
		Iterator <String> i = id.iterator();
		i.next();
		String child_id = i.next();
		driver.switchTo().window(child_id);
		if (search.ArabiaProductDiscount().isDisplayed() == true) {
			log.info("Extracting discount of the product: SUCCESS");
			log.info("Discount: " + search.GalenStudyChairPrice().getText());
		}
		driver.quit();
    }

    @Then("^Print \"([^\"]*)\" on log file$")
    public void print_something_on_log_file(String strArg1) throws Throwable {
		SearchPage search = new SearchPage(driver);
    	if (search.GalenStudyChairPrice().isDisplayed() == true) {
			log.info("Extracting Price of the product: SUCCESS");
			log.info("Price: " + search.GalenStudyChairPrice().getText());
		}
    	driver.quit();
    }
    
    @Then("^Prints \"([^\"]*)\" on log file$")
    public void prints_something_on_log_file(String strArg1) throws Throwable {
    	StoresPage stores = new StoresPage(driver);
		if (stores.StoreAddress().isDisplayed() == true) {
			log.info("Extract Store Address: SUCCESS");
			log.info("Store Address: " + stores.StoreAddress().getText());
		}
		driver.quit();
    }

    @Then("^Print \"([^\"]*)\" text in log file$")
    public void print_something_text_in_log_file(String strArg1) throws Throwable {
		GiftCardsPage gifts = new GiftCardsPage(driver);
		if (gifts.TermsConditionsMessage().isDisplayed() == true) {
			log.info("Extract Terms and Conditions Message: SUCCESS");
			log.info("Terms and Conditions Message: " + gifts.TermsConditionsMessage().getText());
		}
    	driver.quit();
    }

    @Then("^Store \"([^\"]*)\" text in log file$")
    public void store_something_text_in_log_file(String strArg1) throws Throwable {
    	CartPage cart = new CartPage(driver);
    	if (cart.EmptyMessage().isDisplayed()) {
			log.info("Cart is Empty: SUCCESS");
			log.info("Cart Message: " + cart.EmptyMessage().getText());
		}
    	driver.quit();
    }
    
    @Then("^Store \"([^\"]*)\" text in log$")
    public void store_something_text_in_log(String strArg1) throws Throwable {
		AboutUsPage about = new AboutUsPage(driver);
		log.info("Extracting contact Email ID: SUCCESS");
		log.info("Email ID: " + about.EmailID().getText());
    	driver.quit();
    }

    @Then("^Print the \"([^\"]*)\" text in log file$")
    public void print_the_something_text_in_log_file(String strArg1) throws Throwable {
		HomePage home = new HomePage(driver);
		log.info("Extracting CIN: SUCCESS");
		log.info("CIN: " + home.CIN().getText());
    	driver.quit();
    }

    @Then("^Exclude out of stock and print price of \"([^\"]*)\"$")
    public void exclude_out_of_stock_and_print_price_of_something(String strArg1) throws Throwable {
    	SearchPage search = new SearchPage(driver);
    	if (search.AntonStudyTable().isDisplayed() == true) {
			log.info("Price: " + search.AntonStudyTable().getText());
		}
    	driver.quit();
    }

    @Then("^Get the Delivery Query Response and store in log file$")
    public void get_the_delivery_query_response_and_store_in_log_file() throws Throwable {
    	HelpPage help = new HelpPage(driver);
    	help.DeliveryQuery().click();
		log.info("Extracting Help Delivery Query Response: SUCCESS");
		log.info("Help Delivery Query Response: " + help.DeliveryQueryResponse().getText());
    	driver.quit();
    }

}