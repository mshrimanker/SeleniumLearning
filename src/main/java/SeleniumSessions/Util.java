package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {
	
	WebDriver driver;
	
	public Util(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * This method is used to create the webElement on the basis of By locator.
	 * @param locator
	 * @return
	 */
		
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
		element = driver.findElement(locator);
		}
		catch(Exception e) {
		System.out.println("Some exception occured while creating on the web element...");
		System.out.println(e.getMessage());
		}
		return element;
	}
	
	public void waitForElementPresent(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public String waitForTitlePresent(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.titleContains(title));
		return driver.getTitle();
	}
	
	/**
	 * This method is used to click on element
	 * @param locator
	 */
	public void doClick(By locator) {
		try {
		getElement(locator).click();
		}
		catch(Exception e) {
			System.out.println("Some exception occured while clicking on the web element...");
			System.out.println(e.getMessage());
		}
	}	
	/**
	 * This method is used to pass the values in a web element.
	 * @param locator
	 * @param value
	 */
	public void doSendKeys(By locator, String value) {
		try {
		getElement(locator).sendKeys(value);
		}
		catch(Exception e) {
			System.out.println("Some exception occured while passing value to the web element...");
		}
	}
}
