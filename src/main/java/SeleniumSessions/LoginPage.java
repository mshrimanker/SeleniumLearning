package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
				
		//These 3 locators are called page objects
		By emailId = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		
		Util util = new Util(driver);
		
		String title = util.waitForTitlePresent("HubSpot", 10);
		System.out.println(title);
		
//		util.getElement(emailId).sendKeys("test@gmail.com");
//		util.getElement(password).sendKeys("test123");
//		util.getElement(loginButton).click();

		util.waitForElementPresent(emailId, 15);
		util.doSendKeys(emailId, "mitesh@gmail.com");
		util.doSendKeys(password, "test123");
		
		util.waitForElementPresent(emailId, 5);
		util.doClick(loginButton);
	
	}
}
	