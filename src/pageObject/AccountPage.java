package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
	@FindBy(css="#Website")
	WebElement web;
	@FindBy(css="#Address")
	WebElement adress;
	@FindBy(css="#Province")
	WebElement province;
	@FindBy(css="#Country")
	WebElement country;
	@FindBy(css="#Button1")
	WebElement save;
	@FindBy(css="#ePlyHeader_dashboardLink")
	WebElement clickView;
	@FindBy(css="#UpdateClientError")
	WebElement saved;

	public AccountPage(WebDriver driver) {
		super(driver);		
	}

	public void accountInfo(String webtxt, String adrtxt, String slcprv, String contxt) throws InterruptedException {
		Thread.sleep(1000);
		fillText(web, webtxt);
		fillText(adress, adrtxt);
		select(province, slcprv);
		select(country, contxt);
		Thread.sleep(1000);
		click(save);
	}
	public String savedmsg() throws InterruptedException {
		Thread.sleep(1000); 
		return saved.getText();

	}
	public void clickViewForm() {
		click(clickView);
	}
}
