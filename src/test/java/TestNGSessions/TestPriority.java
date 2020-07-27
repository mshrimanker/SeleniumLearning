package TestNGSessions;

import org.testng.annotations.Test;

public class TestPriority {

		
		@Test(priority=1)
		public void homePageTitleTest() {
			System.out.println("Homepage Title Test...");
		}
		
		@Test(priority=2)
		public void homePageHeaderTest() {
			System.out.println("Homepage Header Test...");
		}
		
		@Test()
		public void homePageLinkTest() {
			System.out.println("Homepage Link Test");
		}
		
		@Test()
		public void homePageUserTest() {
			System.out.println("Homepage User Test");
	}
}



