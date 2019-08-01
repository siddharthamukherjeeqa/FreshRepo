package listnerPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListeners2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		//when test method starts
		System.out.println("onTestStart : "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//if test is successful
		System.out.println("onTestSuccess : "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//if test is failed
		System.out.println("onTestFailure : "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//if test is skipped
		System.out.println("onTestSkipped : "+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		//before testng <test> tag 
		System.out.println("onStart : "+ context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods();
		for(ITestNGMethod method : methods) {
			System.out.println(method.getMethodName());
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		//before testng <test> tag 
		System.out.println("onFinish : "+ context.getName());
	}
	
	
}
