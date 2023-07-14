package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import static org.testng.Assert.assertEquals;
import pageObject.AccountPage;
import pageObject.LoginPage;
import pageObject.SearchAllPage;

@Epic("testing my account")
@Feature("account details")
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

	@Severity(SeverityLevel.BLOCKER)
	@Story("when i add details text saved should appear")
	@Issue("2")
	@Test(priority= 2, description = "Test filling information and saving form")
	public void filling_form() throws InterruptedException {
		AccountPage account = new AccountPage(driver);
		account.accountInfo("www.Emilytest.com", "Nesher", "Alberta", "Israel");
		String expected = "Saved.";
		String actual = account.savedmsg();
		assertEquals(actual, expected);
	}

}
