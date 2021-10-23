package test.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	By addToCart = By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");

	public void addtocart() {
		driver.findElement(addToCart).click();
	}

}
