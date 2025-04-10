package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	
	
	@FindBy (xpath = "//*[@id=\"email\"]") WebElement username;
	@FindBy (xpath = "//*[@id=\"password\"]") WebElement password;
	@FindBy (xpath = "//*[@id=\"form\"]/div[3]/div/button") WebElement submit;
	// @FindBy (xpath = "") WebElement alert;
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void username1(String unm) {
		username.sendKeys(unm);
		
	}
	public void password1(String pas) {
		password.sendKeys(pas);
	}
	public void condi(String Condition) {
		
	}
	public void submit1() {
		submit.click();
		
	}
	

}
