package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	WebDriver driver;


	@BeforeClass
	public void setup() {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\neuem\\OneDrive\\Desktop\\Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://events.eply.com/login/index.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}	
}
