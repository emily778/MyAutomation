package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pageObject.EventPage;
import pageObject.LoginPage;
import pageObject.ViewMyFormsPage;

public class NewEventTest extends BaseTest {

	@Test
	public void createNewEvent() {
		LoginPage login = new LoginPage(driver);
		login.login("shavit1986@gmail.com", "shavitdemo123");
		ViewMyFormsPage dropdown = new ViewMyFormsPage(driver);
		dropdown.clickEvent(0);
		EventPage event = new EventPage(driver);
		event.eventInfo("Emilys Event", "Emily", "12/07/2023", "11/07/2023 12:00 AM", "12/07/2023 12:00 AM");
		event.clickOnViewForms();
		String expected = "Emilys Event";
		String actual = dropdown.validateNewEvenet();
		assertEquals(actual, expected);
	}

}
