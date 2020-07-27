package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "J:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //1. Open the browser
		driver.get("http://www.facebook.com"); //2. Enter URL
		
		String title = driver.getTitle(); //3. Get the page title
		System.out.println(title);
		
		//4. Validation point
		if(title.equals("Facebook")){
			System.out.println("Correct title");
		}
		else 
		{
			System.out.println("Incorrect title");
		}
		
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource()); 
		
		//driver.quit(); //close the browser
		//driver.close(); // close the browser //Invalid session ID instead of null session ID.
		
		//System.out.println(driver.getTitle()); //Session ID is null. Using WebDriver after calling quit()?
	}

}


