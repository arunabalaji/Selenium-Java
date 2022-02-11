package StepDef;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import Pages.BrowserStackLoginPage; 	
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.lang3.StringUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;




public class loginStepDef {

	WebDriver driver = null;
	String item_name_order_history = null;
	String item_name_order_summary = null;

	@Given("^Open the Chrome Browser$")
	public void open_the_Chrome_Browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/arunamanoharan/Downloads/chromedriver"); 	  
		driver = new ChromeDriver();	   
		driver.navigate().to("https://bstackdemo.com/");	  
		driver.manage().window().maximize();

	}

	@Given("Click on the SignIn link")
	public void click_on_signin_button() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BrowserStackLoginPage.link_signin(driver).click();	
	}


	@When("Enter Username and Password")
	public void enter_username_password() {

		//Entering Username		
		BrowserStackLoginPage.textbox_username(driver).isDisplayed();
		BrowserStackLoginPage.textbox_username(driver).sendKeys("demouser");
		BrowserStackLoginPage.textbox_username(driver).sendKeys(Keys.ENTER);

		//Entering Password
		BrowserStackLoginPage.textbox_password(driver).sendKeys("testingisfun99");
		BrowserStackLoginPage.textbox_password(driver).sendKeys(Keys.ENTER);		

	}

	@Then("Click on Login button")
	public void click_on_login_button() {
		//Login button click		
		BrowserStackLoginPage.button_login(driver).click();		
	}

	@Then("Verify the webpage has loggedin")
	public void verify_logout_button() {	
		BrowserStackLoginPage.link_logout(driver).isDisplayed();
	}

	@Then("Click on the iphone add to cart")
	public void click_on_iphone() {
		//Product Click
		BrowserStackLoginPage.iphone_add_to_cart(driver).click();
	}

	@Then("Click on the add to cart")
	public void click_on_addtocart() {		
		if(BrowserStackLoginPage.button_add_to_cart(driver).isDisplayed())
		{
			BrowserStackLoginPage.button_add_to_cart(driver).click();
		}
	}

	@Then("Click on checkout button")
	public void click_on_checkout() {

		BrowserStackLoginPage.button_checkout(driver).click();
	}

	//Filling Shipping address Form
	@Then("^Fill the firstname as (.*)$")
	public void fill_shipping_address(String firstname) {
		BrowserStackLoginPage.text_firstname(driver).sendKeys(firstname);				

	}

	@Then("^Fill the lastname as (.*)$")
	public void fill_the_lastname_as_lastname(String lastname) {
		BrowserStackLoginPage.text_lastname(driver).sendKeys(lastname);	   
	}

	@Then("^Fill the address (.*) state (.*) and Postcode (.*)$")
	public void fill_the_address_state_and_Postcode(String address, String state, String postcode) {
		BrowserStackLoginPage.text_address(driver).sendKeys(address);
		BrowserStackLoginPage.text_state(driver).sendKeys(state);
		BrowserStackLoginPage.text_postcode(driver).sendKeys(postcode);
	}

	@Then("Click on Submit button")
	public void click_on_submit_button() {		
		BrowserStackLoginPage.button_checkout_submit(driver).click();
	}

	@Then("Verify the order confirmation message")
	public void verify_order_message() {		
		BrowserStackLoginPage.order_confirmation_message(driver).isDisplayed();
		WebElement item = driver.findElement(By.xpath("//h5[@class='product-title optimizedCheckout-contentPrimary']"));
		item_name_order_summary= item.getText();		
		System.out.println("Order Placed item is " + item_name_order_summary);
		BrowserStackLoginPage.button_continue_shopping(driver).click();		
	}

	@SuppressWarnings("deprecation")
	@Then("Verify the order summary")
	public void verify_order_summary() {
		BrowserStackLoginPage.navbar_tab_order(driver).click();
		WebElement item = driver.findElement(By.xpath("//div[@class='a-fixed-left-grid-col a-col-right']"));
		item_name_order_history= item.getText();
		System.out.println("Order Summary item is " + item_name_order_history);
		Assert.assertTrue(StringUtils.containsIgnoreCase(item_name_order_history, item_name_order_summary));
		driver.close();
	}				

}
