package Base;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Pages.LoginPage;
import Pages.RegisterPage;
import Pages.UserPage;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestResult;

public class BaseClass {

    public WebDriver driver;
    public RegisterPage rp;
    public LoginPage lp;
    public UserPage up;

    // Extent Report variables
    public static ExtentReports extent;
    public static ExtentTest test;

    @BeforeSuite
    public void setupReport() {
    	  String basePath = System.getProperty("user.dir");  // Gives project root
    	    String reportPath = basePath + "/src/test/resources/ExtentReport.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        spark.config().setReportName("Automation Test Results");
        spark.config().setDocumentTitle("Extent Report");

        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Tester", "Crocs");
    }

    @BeforeMethod
    public void Setup(Method method) {
        driver = new ChromeDriver();
        
        // Use whichever page you want to start with:
        //Login Page
        //driver.get("file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/index.html");
        
        //Register Page
        //driver.get("file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/pages/examples/register.html");
        
        //User Page 
        driver.get("file:///Users/adityamagar/Desktop/TNS%20/Selenium%20Softwares/Offline%20Website/pages/examples/add_user.html");
        
        lp = new LoginPage(driver);
        rp = new RegisterPage(driver);
        up = new UserPage(driver);

        // Start Extent Test for each method
        test = extent.createTest(method.getName());
    }

    @AfterMethod
    public void Finish(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test Passed");
        } else {
            test.skip("Test Skipped");
        }

       // driver.quit();
        extent.flush();  // Important to write everything to the report
    }
}
