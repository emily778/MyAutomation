package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pageObject.ForgotPasswordPage;
import pageObject.LoginPage;

public class ForgotPasswordTest extends BaseTest {

	@Test(description = "Test clicking and entering forgot your password page")
	public void forgotPassword_click() {
		LoginPage loginP = new LoginPage(driver);
		loginP.forgotPassword();
		String expected = "https://events.eply.com/login/ForgotPassword.aspx";
		String actual = loginP.url();
		assertEquals(actual, expected);
	}

	@Test(priority = 2, description = "Test entering username and clicking submit")
	public void Instructions () {
		ForgotPasswordPage forgotP = new ForgotPasswordPage(driver);
		forgotP.forgotPass("shavit1986@gmail.com");
		String expected = "Instructions on how to reset your password have been sent to the email address registered with the username provided.";
		String actual = forgotP.getMsg();
		assertEquals(actual, expected);

	}	
}
