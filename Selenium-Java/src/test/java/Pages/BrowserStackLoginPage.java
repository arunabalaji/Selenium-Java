package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserStackLoginPage {
	
	private static WebElement element = null;
	
	public static WebElement link_signin(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='signin']"));
		return element;
	}
	
	public static WebElement textbox_username(WebDriver driver) {
		//element = driver.findElement(By.xpath("//div[@class='css-1g6gooi']//input[@id='react-select-2-input']"));
		element = driver.findElement(By.xpath("//div[@id='username']//input"));
		
		return element;
	}
	public static WebElement logo_class(WebDriver driver) {
		//element = driver.findElement(By.xpath("//div[@class='css-1g6gooi']//input[@id='react-select-2-input']"));
		element = driver.findElement(By.xpath("//div[@class='login_logo']"));
		
		return element;
	}
	
	public static WebElement textbox_password(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='password']//input"));
		return element;
	}
	
	public static WebElement button_login(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='login-btn']"));
		return element;
	}
	
	public static WebElement link_logout(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='logout']"));
		return element;
	}
	
	public static WebElement iphone_add_to_cart(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='1']//div[@class='shelf-item__buy-btn'][normalize-space()='Add to cart']"));
		return element;
	}
	
	public static WebElement button_add_to_cart(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[contains(@class,'float-cart')]"));
		return element;
	}
	
	public static WebElement button_checkout(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='buy-btn']"));
		return element;
	}
	//BStackDemo Shipping Address Page
	public static WebElement text_firstname(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='firstNameInput']"));
		return element;
	}
	
	public static WebElement text_lastname(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='lastNameInput']"));
		return element;
	}
	
	public static WebElement text_address(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='addressLine1Input']"));
		return element;
	}
	
	public static WebElement text_state(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='provinceInput']"));
		return element;
	}
	
	public static WebElement text_postcode(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='postCodeInput']"));
		return element;
	}
	
	public static WebElement button_checkout_submit(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='checkout-shipping-continue']"));
		return element;
	}
	
	public static WebElement order_confirmation_message(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='confirmation-message']"));
		return element;
	}
	
	public static WebElement button_continue_shopping(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@class='button button--tertiary optimizedCheckout-buttonSecondary']"));
		return element;
	}
	
	public static WebElement navbar_tab_order(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='orders']"));
		return element;
	}
	
	public static WebElement order_placed_title(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='orders']"));
		return element;
	}

}
