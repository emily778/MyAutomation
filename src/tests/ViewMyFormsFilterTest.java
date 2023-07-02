package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ViewMyFormsPage;

public class ViewMyFormsFilterTest extends BaseTest{

	
		@Test(description = "Test choosing from dropdown filter and returning number of results")
		public void return_result() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.login("shavit1986@gmail.com", "shavitdemo123");
		ViewMyFormsPage dropdown = new ViewMyFormsPage(driver);
		int expected = 2;
		int actual = dropdown.drpSize();
		assertEquals(actual, expected);
	}

}
