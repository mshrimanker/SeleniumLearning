package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "J:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.co.uk");
		
		driver.navigate().to("https://www.amazon.co.uk");

		System.out.println(driver.getTitle());

	}

}
