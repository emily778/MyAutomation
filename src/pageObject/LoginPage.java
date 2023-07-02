package pageObject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

	// define elements
	@FindBy(css="#body_ForgotPasswordButton")
	WebElement forgotPasswordLink;

	@FindBy(css="#body_Username")
	WebElement username;
	@FindBy(css="#body_Password")
	WebElement password;
	@FindBy(css="#body_SubmitButton")
	WebElement loginSubmit;
	@FindBy(css="#body_ErrorMessage")
	WebElement errorMsg;

	public LoginPage(WebDriver driver) {
		super(driver);

	}	
	//Actions
	public void forgotPassword() {
		click(forgotPasswordLink);	
	}	
	public String url() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public void login(String text_user, String text_pass ) {
		fillText(username, text_user);
		fillText(password, text_pass);
		click(loginSubmit);
	}
	public String getErrorMsg() {
		return errorMsg.getText();
	}
	public String currenturl () {
		String urlnow = driver.getCurrentUrl();
		return urlnow;
	}

}
