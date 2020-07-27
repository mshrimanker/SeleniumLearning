package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreCard {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/19497/scorecard/1225248/england-vs-west-indies-2nd-test-west-indies-in-england-2020");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> scoreList = driver.findElements(By.xpath("//a[contains(text(),'AS Joseph')]//parent::td//following-sibling::td"));
		//System.out.println(scoreList.size());
				
		for(int i=0; i<scoreList.size();i++) {
			System.out.print(scoreList.get(i).getText());		
		}
	}
}
