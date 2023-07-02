package tests;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import pageObject.LoginPage;
import pageObject.SearchAllPage;
import pageObject.ViewMyFormsPage;

public class SearchAllTest extends BaseTest {


	@Test(description = "Test opening Search All page")
	public void open_searchall() {
		LoginPage loginT = new LoginPage(driver);
		loginT.login("shavit1986@gmail.com", "shavitdemo123");
		ViewMyFormsPage form = new ViewMyFormsPage(driver);
		form.clickSearch();
		String expected = "https://events.eply.com/Data/reports-search.aspx";
		String actual = form.geturl();
		AssertJUnit.assertEquals(actual, expected);
	}

	@Test(description = "Test searching results message")
	public void search_result() throws InterruptedException {
		SearchAllPage search = new SearchAllPage(driver);
		search.SearchAll("6/02/2023 12:00 AM", "6/10/2023 12:00 AM", "shavit1986@gmail.com");
		String expected = "No records to display.";
		String actual = search.getResult();
		AssertJUnit.assertEquals(actual, expected);		
	}

}
