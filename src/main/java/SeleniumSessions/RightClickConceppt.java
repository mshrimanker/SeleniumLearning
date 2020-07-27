package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConceppt {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickElement = driver.findElement(By.className("context-menu-one"));
	
		Actions action = new Actions(driver);
		
		action.contextClick(rightClickElement).build().perform(); //contextClick() is used for right click.
	
		String text = driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-copy')]/span")).getText();
		System.out.println(text);
	}
}
