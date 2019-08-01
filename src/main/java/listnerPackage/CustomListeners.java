package listnerPackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListeners implements IInvokedMethodListener{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("beforeInvocation : "+ testResult.getClass().getName() + ", "+ method.getTestMethod().getMethodName());
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("afterInvocation : "+ testResult.getClass().getName() + ", "+ method.getTestMethod().getMethodName());	
	}

}
