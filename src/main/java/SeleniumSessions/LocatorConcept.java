package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "J:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com");
		
		Thread.sleep(5000);

		//1. ID Locator:tag
//		WebElement email = driver.findElement(By.id("username"));
//		email.sendKeys("mitesh@gmail.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("Test123");
	
//		driver.findElement(By.id("username")).sendKeys("mitesh@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Test123");
//		driver.findElement(By.id("loginBtn")).click();
		
		//2. Name Locator:
//		driver.findElement(By.name("username")).sendKeys("mitesh@gmail.com");
		
		//3. Xpath Locator:
//		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("mitesh@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("password");
//		driver.findElement(By.xpath("//*[@id=\'loginBtn\']")).click();
		
		//4. css Locator:
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@123.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("pass123");
		
		//5. ClassName Locator: - ClassName should be unique and all classes cannot be used together.
//		driver.findElement(By.className("login-email")).sendKeys("123@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("password");
		
		//6. Link text: only used for links
//		driver.findElement(By.linkText("Sign up")).click();
		
		//7. Partial link text:
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//8. TagName:
		driver.findElement(By.tagName(""));
			
	}
}
