package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		takePageScreenShot(driver,"loginpage");
		
		WebElement emailId = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		
		emailId.sendKeys("test@gmail.com");
		password.sendKeys("test123");
		//loginButton.click();
		
		takeElementScreenShot(emailId, "emailId");
		takeElementScreenShot(password, "password");
		takeElementScreenShot(loginButton, "loginBtn");		
	
		takePageScreenShot(driver, "loginpageerror");
		
		driver.quit();
	}

	public static void takePageScreenShot(WebDriver driver, String fileName) {
	
		File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File ("./Screenshots/"+fileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void takeElementScreenShot(WebElement element, String fileName) {
	
		File SrcFile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File ("./Screenshots/"+fileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
