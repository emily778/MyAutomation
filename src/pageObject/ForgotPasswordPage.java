package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage{

	@FindBy(css="#body_Username")
	WebElement username;
	@FindBy(css="#body_SubmitButton")
	WebElement submit;
	WebElement message;

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}
	//Actions
	public void forgotPass(String user) {
		fillText(username, user);
		click(submit);
	}
	public String getMsg() {
		message = driver.findElement(By.cssSelector("#body_Message"));
		return message.getText();
	}
}
