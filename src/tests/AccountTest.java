package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import pageObject.AccountPage;
import pageObject.LoginPage;
import pageObject.SearchAllPage;


public class AccountTest extends BaseTest {

	@Test(priority = 1, description = "Test opening account page from search all page")
	public void open_account() {
		LoginPage loginT = new LoginPage(driver);
		loginT.login("shavit1986@gmail.com", "shavitdemo123");
		SearchAllPage search = new SearchAllPage(driver);
		search.clickAccount();
		String expected = "https://events.eply.com/Data/account-settings.aspx";
		String actual = search.acurl();
		assertEquals(actual, expected);
	}

	@Test(priority= 2, description = "Test filling information and saving form")
	public void filling_form() throws InterruptedException {
		AccountPage account = new AccountPage(driver);
		account.accountInfo("www.Emilytest.com", "Nesher", "Alberta", "Israel");
		String expected = "Saved.";
		String actual = account.savedmsg();
		assertEquals(actual, expected);
	}

}
