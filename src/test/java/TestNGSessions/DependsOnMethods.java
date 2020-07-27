package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void login(){
		System.out.println("Login to app");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods="login")
	public void homePageTest() {
		System.out.println("Homepage Test");
	}
	
	@Test(dependsOnMethods="login")
	public void contactsPageTest() {
		System.out.println("Contacts page Test");
	}
}
