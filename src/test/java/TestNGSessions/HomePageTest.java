package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import okhttp3.internal.http2.Header;

public class HomePageTest {

	//Before --- Test --- After
	
	@BeforeSuite //highest level what we want to do before writing the test cases
	public void launchBrowser() {
		System.out.println("Launch browser");
	}
	
	@BeforeTest
	public void launchURL() {
		System.out.println("Launch URL");
	}
	
	@BeforeClass 
	public void loginToAp() {
		System.out.println("Login to Application");
	}
	
	@BeforeMethod
	public void goToHomePage(){
		System.out.println("Go to Home Page");
	}
	
	@Test(priority=1)
	public void homePageTitleTest() {
		System.out.println("Homepage Title Test...");
	}
	
	@Test(priority=2)
	public void homePageHeaderTest() {
		System.out.println("Homepage Header Test...");
	}
	
	@Test(priority=3, enabled=false)
	public void homePageLinkTest() {
		System.out.println("Homepage Link Test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
	
	@AfterClass
	public void goToLoginPage() {
		System.out.println("Go to Login page");
	}
	
	@AfterTest
	public void disconnectWithDB() {
		System.out.println("Disconnect with DB");
	}
	
	@AfterSuite
	public void closeBrowser() {
		System.out.println("Close the browser");
	}

}

/*
 
Launch browser--BS
Launch URL -- BT
Login to Application --BC
 
	Go to Home Page -- BM
	Homepage Header Test... -- Test 1
	Logout -- AM
	
	Go to Home Page -- BM
	Homepage Link Test -- Test 2
	Logout -- AM
	
	Go to Home Page -- BM
	Homepage Title Test... -- Test 3
	Logout -- AM

Go to Login page -- AC
Disconnect with DB -- AT
Close the browser -- AS

*/
