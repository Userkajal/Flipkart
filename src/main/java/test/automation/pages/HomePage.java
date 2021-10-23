package test.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By searchBar = By.xpath("//input[@class='_3704LK']");

	By searchButton = By.xpath("//button[@type='submit']");

	public void searchBar(String input) {
		driver.findElement(searchBar).sendKeys(input);
		driver.findElement(searchBar).sendKeys(Keys.ENTER);

	}

	public void clickSearchButton() {
		driver.findElement(searchButton).click();
		

	}
}