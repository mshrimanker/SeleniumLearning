package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSSSelector {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com");
		
		
	/* ID Concept:
	 * #username
	 * input#username
	 * input[id='username'] 
	 * button#loginBtn
	 * 
	 * With 2 properties
	 * input[id='username'][type='email']
	 * 
	 * Class Concept:
	 * .form-control.private-form__control.login-email ==> replace space with '.'
	 * input.form-control.private-form__control.login-email
	 * input.login-email
	 * button.login-submit 
	 * 
	 * Text Concept:
	 * input[id^='user'] ===> starting text
	 * input[id$='name'] ===> ending text
	 * input[id*='username'] ===> Id contains username
	 *input[id*='user']
	 *
	 *div>input[id='username'] ===> parent and child output
	 *div.private-form__input-wrapper>input#username
	 *
   	*/
	}

}
