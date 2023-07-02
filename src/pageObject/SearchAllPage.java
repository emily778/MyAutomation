package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchAllPage extends BasePage {
	
    @FindBy(css="#RadFromDatePicker_dateInput")
	WebElement fromDate;
    @FindBy(css="#RadToDatePicker_dateInput")
	WebElement toDate;
    @FindBy(css="#Email")
	WebElement email;
    @FindBy(css="#SearchButton")
	WebElement clickSearch;
	WebElement noRecords;
	@FindBy(css="#ePlyHeader_accountLink")
	WebElement clickAccount;

	public SearchAllPage(WebDriver driver) {
		super(driver);
	}

	public void SearchAll(String txtfrdate, String txtodate, String txtemail) throws InterruptedException {
		fillText(fromDate, txtfrdate);
		fillText(toDate, txtodate);
		fillText(email, txtemail);
		Thread.sleep(1000);
		click(clickSearch);
	}	
	public String getResult () {
		noRecords = driver.findElement(By.cssSelector(".rgNoRecords"));
		return noRecords.getText();
	}	
	public void clickAccount() {
		click(clickAccount);
	}
	public String acurl() {
		String ac = driver.getCurrentUrl();
		return ac;
	}
}
