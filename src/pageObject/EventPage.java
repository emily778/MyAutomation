package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EventPage extends BasePage {
	
	@FindBy(css="#EventNameEdit")
	WebElement eventName;
	@FindBy(css="#PageTitle")
	WebElement pageTitle;
	@FindBy(css="#EventDateTextBox")
	WebElement date;
	@FindBy(css="#EventStartDatePicker_dateInput")
	WebElement eventStart;
	@FindBy(css="#EventEndDatePicker_dateInput")
	WebElement eventEnd;
	@FindBy(css="#SaveEventInfoButton2")
	WebElement save;
	@FindBy(css="#ePlyHeader_dashboardLink")
	WebElement viewFormsPage;

	public EventPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void eventInfo (String nametxt, String titletxt, String datetxt, String startxt, String endtxt) {
		fillText(eventName, nametxt);
		fillText(pageTitle, titletxt);
		fillText(date, datetxt);
		fillText(eventStart, startxt);
		fillText(eventEnd, endtxt);
		click(save);
	}
	
	public void clickOnViewForms() {
		click(viewFormsPage);
	}
}
