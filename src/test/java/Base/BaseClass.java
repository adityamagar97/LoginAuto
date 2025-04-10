package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.LoginPage;

public class BaseClass {
	
	
	
public	WebDriver driver;
public 	LoginPage lp;
	@BeforeMethod
	public void Setup() {
	driver = new ChromeDriver();
	driver.get("file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/index.html");
	lp = new LoginPage(driver);

}

	
	@AfterMethod
	public void Finish() {
	driver.quit();
	}
}
