package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObject.LoginPage;

public class LoginTest extends BaseTest {


	@Test(description = "Test enetering login page and enter incorrect info")
	public void login_failure() {

		LoginPage login = new LoginPage(driver);
		login.login("shavit1986@gmail.com", "shavitdemo111");
		String expected = "Sorry, either your username or password was incorrect.";
		String actual = login.getErrorMsg();
		assertEquals(actual, expected);
	}
	@Test(description = "Test enetering login page and enter correct info")
	public void login_success() {
		LoginPage login = new LoginPage(driver);
		login.login("shavit1986@gmail.com", "shavitdemo123");
		String expected = "https://events.eply.com/data/dashboard.aspx";
		String actual = login.currenturl();
		assertEquals(actual, expected);

	}
}
