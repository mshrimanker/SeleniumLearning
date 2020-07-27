package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageCase2 {

	WebDriver driver;
	SoftAssert softAssert;

	@BeforeTest
	public void seUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		softAssert = new SoftAssert();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("HubSpot"));

		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, "HubSpot Login", "login page title mismatched"); 
	}

	@Test(priority = 2)
	public void signUpLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Sign up")).isDisplayed(), "sign up link not available");
	}

	@Test(priority = 3)
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("miteshshrimanker@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@123*");
		driver.findElement(By.id("loginBtn")).click();

		// WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//i18n-string[contains(text(),'Thanks
		// for choosing HubSpot')]")));
		softAssert.assertTrue(driver
				.findElement(By.xpath("//i18n-string[contains(text(),'Thanks for choosing HubSpot')]")).isDisplayed(),
				"Home page is not present");

		String header = driver.findElement(By.xpath("//i18n-string[contains(text(),'Thanks for choosing HubSpot')]"))
				.getText();
		System.out.println("Homepage header is : " + header);
		softAssert.assertEquals(header, "Thanks for choosing HubSpot", "Header text is not matched");

		String title = driver.getTitle();
		System.out.println("Home page title is: " + title);
		softAssert.assertEquals(title, "Welcome");

		softAssert.assertAll();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
