package Pages;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;

import org.testng.annotations.Test;

import Base.BaseClass;
import Utilities.Provider;

public class RunNow extends BaseClass{
	
	
	@Test (dataProvider = "loginData", dataProviderClass = Provider.class )
	void LoginFirst(String unm,String pas,String Condition) {
	
	lp.username1(unm);
	lp.password1(pas);
	lp.submit1();
	
	if(Condition.equals("valid")) {
		System.out.println("Printing");
		AssertJUnit.assertEquals(driver.getCurrentUrl(),"file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
	}
	else if(Condition.equals("invalid))"))
	{
		System.out.println("Not Printing");
		AssertJUnit.assertEquals(driver.getCurrentUrl(),"file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/index.html");
	}
	}

	
	
}
