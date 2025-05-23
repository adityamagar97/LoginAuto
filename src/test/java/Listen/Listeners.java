package Listen;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Start: "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success: "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed: "+ result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Started: "+ context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finished: "+ context.getName());
	}

	
	

}
