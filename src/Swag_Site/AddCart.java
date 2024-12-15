package Swag_Site;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddCart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.id("user-name"));
		
		username.sendKeys("standard_user");
		Thread.sleep(200);
		
		System.out.println("changes to be commintted to master");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("secret_sauce");
		
	WebElement login = driver.findElement(By.id("login-button"));
		
		login.click();
		
		
	Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")));

	
	dropdown.selectByVisibleText("Price (low to high)"); 
	
	WebElement addCart = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
	
	addCart.click();
	

	WebElement text = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
	
	System.out.println(text.getText());
	
	WebElement cart = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
	
	cart.click();
	
	
	WebElement checkout = driver.findElement(By.id("checkout"));
	
	checkout.click();
	
	WebElement Firstname = driver.findElement(By.id("first-name"));
	
	Firstname.sendKeys("Akhila S");
	
	WebElement Lastname = driver.findElement(By.id("last-name"));
	
	Lastname.sendKeys("Babu");
	
	WebElement Postalcode = driver.findElement(By.id("postal-code"));
	
	Postalcode.sendKeys("345687");
	
	WebElement button = driver.findElement(By.id("continue"));
	
	button.click();
	
	WebElement finish = driver.findElement(By.id("finish"));
	
	finish.click();
	
	
	}

}
