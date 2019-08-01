package listnerPackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomizedCustomListener implements IInvokedMethodListener,ITestListener,ISuiteListener{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		Reporter.log("beforeInvocation : "+ testResult.getClass().getName() + ", "+ method.getTestMethod().getMethodName());
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		Reporter.log("afterInvocation : "+ testResult.getClass().getName() + ", "+ method.getTestMethod().getMethodName());	
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		//when test method starts
		Reporter.log("onTestStart : "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//if test is successful
		Reporter.log("onTestSuccess : "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//if test is failed
		Reporter.log("onTestFailure : "+ result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		//if test is skipped
		Reporter.log("onTestSkipped : "+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		//before testng <test> tag 
		Reporter.log("onStart : "+ context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods();
		for(ITestNGMethod method : methods) {
			Reporter.log(method.getMethodName());
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		//before testng <test> tag 
		Reporter.log("onFinish : "+ context.getName());
	}
	
	@Override
	public void onStart(ISuite suite) {
		//when <Suite> tag starts
		Reporter.log("onStart : before suite starts");
	}

	@Override
	public void onFinish(ISuite suite) {
		//when <Suite> tag completes
		Reporter.log("onFinish : after suite completes");
	}
}
