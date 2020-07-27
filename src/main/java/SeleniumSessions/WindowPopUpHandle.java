package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUpHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("	");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowID = it.next(); //to move the iterator from 1 location to the next.
		System.out.println("Parent Window ID: " + parentWindowID);
			
		String childWindowID = it.next();
		System.out.println("Child Window ID: " + childWindowID);
		
		driver.switchTo().window(childWindowID); //switch to child window
		System.out.println(driver.getTitle()); 
		
		driver.close(); //to close the child window pop up.
		
		driver.switchTo().window(parentWindowID); //switch to parent window
		System.out.println(driver.getTitle()); 
		
		driver.quit();
	}
}
