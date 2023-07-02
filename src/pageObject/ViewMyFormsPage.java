package pageObject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewMyFormsPage extends BasePage {

    @FindBy(css=".col-auto.ml-auto.header-links.align-self-center>a#ePlyHeader_SearchLink")
	WebElement openSearchAll;
    @FindBy(css="#DateFilter")
	WebElement clickfilter;
    @FindBy(css="#DateFilter")
	WebElement fromfilter;
	List<WebElement> result;
	@FindBy(css="tbody>tr")
	List<WebElement> clickevent;
	List<WebElement> selectEvent;
	@FindBy(css=".rgRow>td>span[style='cursor:pointer']")
	WebElement newEvent;

	public ViewMyFormsPage(WebDriver driver) {
		super(driver);
	}

	public void clickSearch() {
		click(openSearchAll);
	}
	public String geturl() {
	String url = driver.getCurrentUrl();
		return url;
	}
	public int drpSize() throws InterruptedException {
	 select(fromfilter, "Show all forms");
	 List<WebElement> result = driver.findElements(By.cssSelector("tbody>tr"));
	   int size = result.size();
	    Thread.sleep(3500);
	    System.out.println("Numbers of results is: "+size);
	    return result.size();    	    
	}   	
	public void EventPage(int selection) {
		clickevent.get(selection).click();
	}
	public void clickEvent (int index) {
		List<WebElement> selectEvent = driver.findElements(By.cssSelector(".fa.fa-cogs"));
		selectEvent.get(index).click();
	}	
	
	public String validateNewEvenet() {
		return newEvent.getText();
	}
		
}
