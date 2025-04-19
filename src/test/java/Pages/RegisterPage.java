package Pages;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	
	@FindBy (xpath = "//*[@id=\"name\"]" )WebElement Name;
	@FindBy (xpath = "//*[@id=\"mobile\"]" )WebElement Mobile;
	@FindBy (xpath = "//*[@id=\"email\"]" )WebElement Email;
	@FindBy (xpath = "//*[@id=\"password\"]" )WebElement Password;
	@FindBy (xpath = "//*[@id=\"form\"]/div[5]/div/button" )WebElement Signin;
	
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
	
		PageFactory.initElements(driver,this);
	}
	
	
	public void nam(String name) {
		Name.sendKeys(name);
		
	}
public void mob(String mobile) {
	
	Mobile.sendKeys(mobile);
	}
	
public void ema(String email) {
	Email.sendKeys(email);
}

public void pass(String password) {
	
	Password.sendKeys(password);
}

public void sib() {
	Signin.click();
}

public void ale() {
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
}

	
	
}

