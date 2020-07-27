package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
//		WebElement frameElement = driver.findElement(By.name("main"));	
//		driver.switchTo().frame(frameElement); //pass by frame element
						
//		driver.switchTo().frame("main"); //pass by name or id.

		driver.switchTo().frame(2); //pass by index.
		
		String text = driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent(); //It will switch back to the main page
		
		driver.switchTo().parentFrame(); // if it is nested frame then to come back to 1st frame we can use this method.
	}
}
