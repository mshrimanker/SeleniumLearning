package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
	
		Select select = new Select(day);
//		select.selectByVisibleText("30"); //This will select exact value which is preferable.
//		select.selectByIndex(10); //This will select the value at 10th Index in the drop down.
//		
//		Select select1 = new Select(month);
//		select1.selectByVisibleText("Nov");
//		
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("1988");	
//
//		selectValueFromDropDownByText(day, "30");
//		selectValueFromDropDownByText(month, "Nov");
//		selectValueFromDropDownByText(year, "1988");		
//	
//		selectValueFromDropDownByIndex(day, 21);
//		selectValueFromDropDownByIndex(month, 4);
//		selectValueFromDropDownByIndex(year, 5);

		System.out.println(select.isMultiple()); //This return boolean value and tells you if the drop is multi-select.
	}
	/**
	 * This method is used to select the value from a drop down on the basis of given text.
	 * @param element
	 * @param value
	 */
	public static void selectValueFromDropDownByText(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	/**
	 * This method is used to select the value from a drop down on the basis of given index.
	 * @param element
	 * @param index
	 */
	public static void selectValueFromDropDownByIndex(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);	
	}

}
