package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_xpath_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
/*
		//htmltag[@property1='value']
		//input[@id='username']

		//htmltag[@property1='value' and @property2='value']
		//input[@id='username' and @type='login-email']
		
		//input[@class='form-control private-form__control login-email']
		
		contains() in xpath:
		//htmltag[contains(@property,'value')]
		//input[contains(@class,'login-email')]
		//input[contains(@id,'username')]
		
		2 properties - 1 with contains and 1 without:
		//input[@id='username' and contains(@class,'login-email')]
		//input[@id='username' and contains(@class,'')] = this also works as it's unique.
		
		contains used for dynamic ids:
		<input id='test_123>
		<input id='test_323>
		<input id='test_143>
		<input id='test_127>
		//input[contains(@id,'test_')] = this can be used as part of it is the same
		
		WHERE THERE IS 2 ELEMENTS, YOU CAN PASS THROUGH INDEX AS BELOW:
		(//input[contains(@class,'form-control')])[1]
		(//input[contains(@class,'form-control')])[2]
		
		Can also use position function instead of Index:
		(//input[contains(@class,'form-control')])[position()=1]	
		(//input[contains(@class,'form-control')])[position()=2]
		
		(//input[contains(@class,'form-control')])[last()] = Can go to last element 
*/		
		
		/* How to use to text() in xpath:
		 * simlpy use html tag and apply index concept like below = (//i18n-string)[1]
		 * htmltag[text()='value']
		 * //i18n-String[text()'Forgot my password'] 
		 * //h2[text()="That email address doesn't exist."]
		 * //span[text()='Show Password'] --- without contains
		 * //span[contains(text(), 'Show Password')] --- with contains and text
		 * //i18n-string[contains(text(),'account')]
		 * 
		 * //h1[@class='private-page_title']
		 * //h1[text()='Sales Dashboard']
		 * 
		 * //span[text()='Greetel']
		 * //span[starts-with(@class,'account')]
		 * //span[starts-with(text(),'Greetel')]
		 * //span[starts-with(@class,'private-page__title')]
		 * //h1[starts-with(text(),'Sales')]  
		 */
		
		// * means any element
		//*[@id='username'] - this will check all the elements so it will take more time
		//input[@id='username'] - Input will search exactly so takes less time
		
		//div//input[@id='username'] - This is parent and child
		
		//div//input - direct + indirect child
		//div/input - single slash means direct child
		
	}	
}
 