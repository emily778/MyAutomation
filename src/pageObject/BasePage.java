package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class BasePage {
	
   WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click(WebElement el) {
		el.click();
	}
	
	public void fillText(WebElement el, String text) {
		el.clear();
		el.sendKeys(text);
	}
	
	public void select(WebElement el, String txt) {
		Select selects = new Select(el);
		selects.selectByVisibleText(txt);
	}	
	
}
