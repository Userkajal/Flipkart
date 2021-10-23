package test.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By userName = By.xpath("//input[@class='_2IX_2- VJZDxU']");
	By password = By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']");
	By loginButton = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	
	
	public void inputUsername(String input) {
		driver.findElement(userName).sendKeys(input);
	}
	
	public void inputPassword(String input) {
		driver.findElement(password).sendKeys(input);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
}
