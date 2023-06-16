package firstWeekTest;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import firstWeekTest.Methods;

public class CustomListener extends Methods implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		try {
			Methods.takeScreenShot("Success" + result.getMethod().getMethodName());
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			Methods.takeScreenShot("Failed" + result.getMethod().getMethodName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	

}
