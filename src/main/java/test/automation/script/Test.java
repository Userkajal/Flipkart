package test.automation.script;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import test.automation.pages.HomePage;
import test.automation.pages.LoginPage;
import test.automation.pages.ProductPage;
import test.automation.pages.SearchResultPage;

public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:/java practice/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			LoginPage page = new LoginPage(driver);

			page.inputUsername("kstesting246@gmail.com");

			page.inputPassword("TestPassword");

			page.clickLogin();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			HomePage homePage = new HomePage(driver);
			homePage.searchBar("Mobile Phones");
			// homePage.clickSearchButton();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			SearchResultPage searchResultPage = new SearchResultPage(driver);
			searchResultPage.clickPhone();

			Set<String> windows = driver.getWindowHandles();
			for (String tempWindow : windows) {
				driver.switchTo().window(tempWindow);
			}

			ProductPage productPage = new ProductPage(driver);
			productPage.addtocart();

		} catch (Exception ex) {
			ex.printStackTrace();

			driver.quit();
		}
	}

}
