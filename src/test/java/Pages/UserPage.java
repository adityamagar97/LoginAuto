package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserPage {
	
	@FindBy (xpath = "//*[@id=\"username\"]" ) WebElement username ; 
	@FindBy (xpath = "//*[@id=\"mobile\"]" ) WebElement mobile ; 
	@FindBy (xpath = "//*[@id=\"email\"]" ) WebElement email ; 
	@FindBy (xpath = "//*[@id=\"course\"]" ) WebElement course ; 
	@FindBy (xpath = "//*[@id=\"Male\"]" ) WebElement gender ; 
	@FindBy (xpath = "/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select" ) WebElement Dropdown ; 
	@FindBy (xpath = "//*[@id=\"password\"]" ) WebElement password ; 
	@FindBy (xpath = "//*[@id=\"submit\"]" ) WebElement submit ; 
	
	
	WebDriver driver ;
	public UserPage(WebDriver driver ) {
	    
		this.driver = driver; 
		PageFactory.initElements(driver, this);
			
	}
	
	
	public void User(String user) {
		username.sendKeys(user);
		
	}
	public void Mobil(String mobil) {
		mobile.sendKeys(mobil);
		
	}
	public void Ema(String ema) {
		email.sendKeys(ema);
		
	}
	public void Cors(String cors) {
		course.sendKeys(cors);
		
	}
	public void gen() {
		
		gender.click();
		
	}
	 public void Stat() {
		 Select stateDropdown = new Select(Dropdown);
			stateDropdown.selectByVisibleText("Maharashtra");
	    }
	 
	 public void Pass(String pass) {
	        password.sendKeys(pass);
	    }

	    public void SubmitForm() {
	        submit.click();
	    }
	    public void acceptAlert() {
	        Alert alert = driver.switchTo().alert();
	        alert.accept();  
	    }
	

}
