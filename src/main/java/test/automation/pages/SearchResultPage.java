package test.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

	WebDriver driver;

	public SearchResultPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	By selectPhone = By.xpath("//div[contains(text(),'realme C21Y (Cross Black, 64 GB)')]");

	public void clickPhone() {
		driver.findElement(selectPhone).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

}
