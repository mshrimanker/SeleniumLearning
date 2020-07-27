package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_2 {

	public static void main(String[] args, Actions action) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*using the following concept from html tags: div to div or div to inner sections
		 * //div[@class='input-group']//following::input[@name='username']
		 * 
		 * Assume name, id is not there then you can use like this:
		 * (//div[@class='input-group']//following::input)[1]
		 * (//div[@class='input-group']//following::input)[2]
		 * (//div[@class='input-group']//following::input)[3]
		 * 
		 * Below are called Xpath Axes:
		 * //input[@name='username']//preceding::div ==> shows you all the div before
		 * //input[@name='username']//parent::div ==> it will show you the immediate parent of the input.
		 * //div[@class='input-group']//child::input[@name='username'] ==> it will show you child to parent.
		 * //div[@class='input-group']//ancestor::div[@class='container'] ==> it goes to the highest div and defines ancestor to containers.
		 * //span[text()='naveen k']//ancestor::td//preceding-sibling::td//input ==> checkbox: it goes to the same tags at the same level so they are called siblings.
		 * //span[text()='naveen k']//ancestor::td//preceding-sibling::td//child::input
		 * //span[text()='naveen k']//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__inner'] ==> you can also use span
		 * 
		 * How to create xpath with A tag:
		 * //a[contains(text(),'Ashish pal')]//parent::td//preceding-sibling::td/input[@name='contact_id'and@type='checkbox'] ==> to go left column	 direction in table
		 * //a[contains(text(),'Ashish pal')]//parent::td//following-sibling::td/a[@context='conpany'] ==> to go to right column in table 	
		 * 
		 *  example of cricinfo info: 
		 *  //a[contains(text(),'JD Campbell')]//parent::td//following-sibling::td[contains(text(),'12')]
		 * 
		 * Reversing Xpath: traversing from child to parent >> grandparent >> superparent >> to the top of DOM.
		 * //input[@id='username']/../../../.. ===> '/..' will go to parent everytime.
		 * //input[@id='username']//..//...//.. ===> you can also use '//..'  
		 * ("//input[@id='username']/../../../../..").getattribute("id")
		 * 
		 * 
		 * 
		 *  
		 *  
		 *  
		 */
		
		selectContact(action, driver, "naveen k");

		selectContact(action, driver, "syed irfan");
	
	}
		public static void selectContact(Actions action, WebDriver driver, String contactName){
			action.click(driver.findElement(By.xpath("//span[text()='"+contactName+"']//ancestor::td//preceding-sibling::td//span[@class='private-checkbox__inner']")))
			.build().perform();
			
			
		}
		
		
	}



