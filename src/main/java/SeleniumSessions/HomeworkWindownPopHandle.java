package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeworkWindownPopHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #4")).click();
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next();
		System.out.println("Parent Window ID: " + parentWindowID);
		
		String child1WindowID = it.next();
		System.out.println("Child Window ID: " + child1WindowID);
		
		String child2WindowID = it.next();
		System.out.println("child2WindowID: " +child2WindowID);
		
		driver.switchTo().window(child1WindowID);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(child2WindowID);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}
}
